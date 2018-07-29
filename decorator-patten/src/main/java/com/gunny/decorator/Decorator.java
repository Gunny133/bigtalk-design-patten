package com.gunny.decorator;

public abstract class Decorator extends Component {
    protected Component component;

    //can use constructor
    public void setComponent(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
