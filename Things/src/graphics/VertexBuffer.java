package graphics;

import java.nio.Buffer;

/**
 * Created by germangb on 17/06/16.
 */
public class VertexBuffer {

    /** signal renderer */
    private boolean dirty = true;

    /** Vertex attribute */
    private Attribute attribute;

    /** Mesh usage */
    private Usage usage;

    /** Vertex data */
    private Buffer data = null;

    public VertexBuffer (Attribute attribute, Usage usage) {
        this.attribute = attribute;
        this.usage = usage;
    }

    /**
     * Set data. Sets dirty to true
     * @param data vertex data
     */
    public void setData (Buffer data) {
        this.data = data;
        this.dirty = true;
    }

    /**
     * Get vertex buffer data
     * @return data buffer
     */
    public Buffer getData () {
        return data;
    }

    /**
     * Check signal. Sets dirty to false
     * @return true if data is dirty
     */
    public boolean dirty () {
        boolean ret = dirty;
        dirty = false;
        return ret;
    }

    /**
     * Get attribute
     * @return attribute
     */
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * Get usage
     * @return usage
     */
    public Usage getUsage() {
        return usage;
    }
}