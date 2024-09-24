package Structural;
interface NewSystem {
    void performAction();
}

class LegacySystem {
    void oldAction() {
        System.out.println("Legacy system performing old action.");
    }
}


class LegacyAdapter implements NewSystem {
    private LegacySystem legacySystem;

    public LegacyAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void performAction() {
        legacySystem.oldAction();
    }
}

public class Adapter {
    public static void main(String[] args) {
        LegacySystem legacySystem = new LegacySystem();
        NewSystem newSystem = new LegacyAdapter(legacySystem);
        newSystem.performAction();
    }
}
