package Day17Set.bean;

/**
 * @author afeng
 * @date 2018/7/26 19:50
 * 姓名,语文成绩,数学成绩,英语成绩,按照总分从高到低输出到控制台
 **/
public class Student  implements Comparable
{
    /**
     * 通过实现Comparable接口可以对treeSet进行比较
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o)
    {
        if(o instanceof Student)
        {
            int num=(((Student) o).getTotalScore()-this.getTotalScore() );
            return num==0?((Student) o).getName().compareTo(this.getName()):num;
        }
        return 0;
    }

    private String name;
    private Integer chineseScore;
    private Integer mathScore;
    private Integer englistScore;

    public Student(String name, Integer chineseScore, Integer mathScore, Integer englistScore)
    {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englistScore = englistScore;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getChineseScore()
    {
        return chineseScore;
    }

    public void setChineseScore(Integer chineseScore)
    {
        this.chineseScore = chineseScore;
    }

    public Integer getMathScore()
    {
        return mathScore;
    }

    public void setMathScore(Integer mathScore)
    {
        this.mathScore = mathScore;
    }

    public Integer getEnglistScore()
    {
        return englistScore;
    }

    public void setEnglistScore(Integer englistScore)
    {
        this.englistScore = englistScore;
    }

    public int getTotalScore(){
        return chineseScore+mathScore+englistScore;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", englistScore=" + englistScore +
                '}';
    }
}
