package scene;

/**
 * Created by germangb on 19/06/16.
 */
public abstract class Component {

    /** The thing this component is attached to */
    protected Thing thing;

    public Component (Thing thing) {
        this.thing = thing;
    }

    /**
     * Get the thing the component is attached to
     * @return a Thing
     */
    public Thing getThing () {
        return thing;
    }

    /** Called to initilize component */
    public void onInit () {
    }

    /** Called to update component */
    public void onUpdate () {
    }

    /**
     * Called to handle messages
     * @param message message
     */
    public void onMessage (Object message) {
    }

    /** Called when component is destroyed */
    public void onFree () {
    }
}