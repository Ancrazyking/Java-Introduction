package JavaCore01;

/**
 * @author afeng
 * @date 2018/7/27 19:16
 **/
public class News
{
    private String newsId;
    private String newsName;
    private String newsCreater;

    public News(String newsId, String newsName, String newsCreater)
    {
        this.newsId = newsId;
        this.newsName = newsName;
        this.newsCreater = newsCreater;
    }

    public String getNewsId()
    {
        return newsId;
    }

    public void setNewsId(String newsId)
    {
        this.newsId = newsId;
    }

    public String getNewsName()
    {
        return newsName;
    }

    public void setNewsName(String newsName)
    {
        this.newsName = newsName;
    }

    public String getNewsCreater()
    {
        return newsCreater;
    }

    public void setNewsCreater(String newsCreater)
    {
        this.newsCreater = newsCreater;
    }

    @Override
    public String toString()
    {
        return "News{" +
                "newsId='" + newsId + '\'' +
                ", newsName='" + newsName + '\'' +
                ", newsCreater='" + newsCreater + '\'' +
                '}';
    }
}
