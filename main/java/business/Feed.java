package business;

import java.util.ArrayList;
import java.util.List;

public class Feed {

	final String title;
	final String link;
	final String content;
	final String description;
	final String language;
	final String copyright;
	final String pubDate;
	
	final List<FeedMessage> entries = new ArrayList<>();
	
	

	public Feed(String title, String link,String content, String description, String language, String copyright, String pubDate) {
		this.title = title;
		this.link = link;
		this.content = content; 
		this.description = description;
		this.language = language;
		this.copyright = copyright;
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public String getDescription() {
		return description;
	}

	public String getLanguage() {
		return language;
	}

	public String getCopyright() {
		return copyright;
	}

	public String getPubDate() {
		return pubDate;
	}

	public List<FeedMessage> getMessages() {
		return entries;
	}

	@Override
	public String toString() {
		return "Feed [title=" + title + ", link=" + link + ", description=" + description + ", language=" + language
				+ ", copyright=" + copyright + ", pubDate=" + pubDate + ", entries=" + entries + "]";
	}
	
	
	
}