package generated;


/** LLM-generated reconstruction from the supplied description. */
import java.util.Map;
import java.util.Set;
public class GenericMapKeySet<K,V> {
    private final Map<K,V> map;
    public GenericMapKeySet(Map<K,V> map) { this.map=map; }
    public Set<K> keys() { return map.keySet(); }
}
