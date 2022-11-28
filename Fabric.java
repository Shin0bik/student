public class Fabric {
    public static void main(String[] Args) {
        int furnace = 160;
        int bigFurnace = 500;
        boolean busyFurnace = false;
        boolean busyBigFurnace = false;
        int plan;
        int remains;
        int smelt;
        if (plan > 160 && plan < 500 && busyFurnace) {
            smelt = plan / furnace;
        } else smelt = 0;
        if (plan > 500 && busyBigFurnace) {
            smelt = plan / bigFurnace;
        } else smelt = 0;
        if ((plan > furnace + bigFurnace) && busyBigFurnace && busyFurnace) {
            smelt = plan / (furnace + bigFurnace);
        }

    }
}
