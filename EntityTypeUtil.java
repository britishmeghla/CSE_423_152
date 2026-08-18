package generated;

import generated.EntityStoreOptions;

/** LLM-generated reconstruction from the supplied description. */
public class EntityTypeUtil {
    private final EntityStoreOptions options;
    public EntityTypeUtil(EntityStoreOptions options) { this.options=options; }
public boolean isRelated(String parent, String child) { return parent.equals(child) || options.isDummyForeignKeys(); }
}
