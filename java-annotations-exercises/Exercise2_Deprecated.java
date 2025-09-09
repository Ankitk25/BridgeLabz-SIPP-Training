class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("oldFeature() is deprecated. Please use newFeature().");
    }

    public void newFeature() {
        System.out.println("newFeature() is the recommended method now.");
    }
}

public class Exercise2_Deprecated {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}