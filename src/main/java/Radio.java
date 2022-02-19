public class Radio {
    private int currentStation;
    private int volume;

    public Radio() {

    }

    public void setCurrentStation(int newStation) {
        if (newStation <= 9 && newStation >= 0) {
            currentStation = newStation;
        } else {
            currentStation = 0;
        }
    }

    public int next(int ncurrentStation) {
        if (ncurrentStation == 9) {
            ncurrentStation = 0;

        } else {
            ncurrentStation += 1;
        }
        return ncurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int prev(int ncurrentStation) {
        if (ncurrentStation == 0) {
            ncurrentStation = 9;

        } else {
            ncurrentStation -= 1;
        }
        return ncurrentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void turnUpVolume() {
        int currentVolume = getVolume();
        if (currentVolume == 10) {
            return;
        } else {
            volume += 1;
        }
    }

    public void turnDownVolume() {
        int currentVolume = getVolume();
        if (currentVolume == 0) {
            return;
        } else {
            volume -= 1;

        }
    }
}