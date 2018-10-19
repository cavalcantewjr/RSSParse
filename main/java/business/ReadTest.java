package business;

public class ReadTest {

	public static void main(String[] args) {
		RSSFeedParser parser = new RSSFeedParser(
                "http://revistaautoesporte.globo.com/rss/ultimas/feed.xml");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);

        }

	}

}
