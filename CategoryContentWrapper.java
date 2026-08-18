package generated;

import generated.EntityTypeUtil;
import generated.CacheListener;

/** LLM-generated reconstruction from the supplied description. */
public class CategoryContentWrapper {
    private final EntityTypeUtil entityTypes;
    private final CacheListener cacheListener;
    public CategoryContentWrapper(EntityTypeUtil entityTypes, CacheListener cacheListener) { this.entityTypes=entityTypes; this.cacheListener=cacheListener; }
public String renderCategory(String category) { cacheListener.onChange(category); return "CONTENT:" + category; }
}
