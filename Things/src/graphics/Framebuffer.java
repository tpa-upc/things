package graphics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by germangb on 18/06/16.
 */
public class Framebuffer {

    /** Signal renderer */
    private boolean destroy = false;

    /** Render targets */
    protected List<Texture> targets;

    /** Depth target */
    protected Texture depth = null;

    /** framebuffer resolution */
    protected int width, height;

    public Framebuffer (int width, int height) {
        this(width, height, false);
    }

    public Framebuffer (int width, int height, boolean hasDepth) {
        this.targets = new ArrayList<>();
        this.width = width;
        this.height = height;
        createTextures();

        if (hasDepth) {
            createDepth();
        }
    }

    /**
     * Get render target textures
     * @return targets
     */
    public List<Texture> getTargets () {
        return targets;
    }

    /**
     * Get depth texture
     * @return
     */
    public Texture getDepth () {
        return depth;
    }

    /** Create render textures */
    protected void createTextures () {
        Texture tex = new Texture(width, height, TextureFormat.RGB);
        targets.add(tex);
    }

    /** Create depth texture */
    protected void createDepth () {
        depth = new Texture(width, height, TextureFormat.DEPTH);
    }

    /** Destroy texture */
    public void destroy () {
        destroy = true;
        depth.destroy();
        targets.forEach(Texture::destroy);
    }

    /**
     * Check destroy flag
     * @return
     */
    public boolean isDestroy() {
        return destroy;
    }
}