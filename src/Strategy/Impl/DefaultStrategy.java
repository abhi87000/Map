package Strategy.Impl;

import Strategy.CalStrategy;

public class DefaultStrategy implements CalStrategy {
    @Override
    public int cal() {
        return 1;
    }
}
