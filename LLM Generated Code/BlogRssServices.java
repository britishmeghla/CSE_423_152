package generated;

import generated.DispatchContext;
import generated.CategoryContentWrapper;

/** LLM-generated reconstruction from the supplied description. */
public class BlogRssServices {
    private final DispatchContext context;
    public BlogRssServices(DispatchContext context) { this.context=context; }
public String generateFeed(java.util.List<String> posts) { return "<rss>" + posts.size() + "</rss>"; }
}
