package class_tasks.chapter_11_abstract_classes_and_interfaces.practice_tasks;

// 6. Create an Interface TvRemote and use it to inherit another Interface SmartTvRemote
// 7. Create a Class Tv which implements TvRemote Interface and another Class SmartTv which Inherits Tv and implements SmartTvRemote Interface

interface TvRemote {
    void nextChannel();
    void previousChannel();
    void lowerVolume();
    void raiseVolume();
}

interface SmartTvRemote extends TvRemote {
    void openBrowser();
    void openYouTube();
    void openNetFlix();
}

class Tv implements TvRemote {
    @Override
    public void nextChannel() {
        System.out.println("Changing to next channel");
    }

    @Override
    public void previousChannel() {
        System.out.println("Changing to previous channel");
    }

    @Override
    public void lowerVolume() {
        System.out.println("Lowering volume");
    }

    @Override
    public void raiseVolume() {
        System.out.println("Raising volume");
    }

    void tuneChannel() {
        System.out.println("Tuning channel");
    }
}

class SmartTv extends Tv implements SmartTvRemote {
    @Override
    public void nextChannel() {
        System.out.println("Changing to next channel");
    }

    @Override
    public void previousChannel() {
        System.out.println("Changing to previous channel");
    }

    @Override
    public void lowerVolume() {
        System.out.println("Lowering volume");
    }

    @Override
    public void raiseVolume() {
        System.out.println("Raising volume");
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening Browser");
    }

    @Override
    public void openYouTube() {
        System.out.println("Opening YouTube");
    }

    @Override
    public void openNetFlix() {
        System.out.println("Opening NetFlix");
    }
}

public class Part_60_6_and_7 {
    public static void main(String[] args) {
        SmartTv samsungTv = new SmartTv();

        samsungTv.nextChannel();
        samsungTv.previousChannel();
        samsungTv.raiseVolume();
        samsungTv.lowerVolume();
        samsungTv.openBrowser();
        samsungTv.openYouTube();
        samsungTv.openNetFlix();
        samsungTv.tuneChannel();
    }
}
