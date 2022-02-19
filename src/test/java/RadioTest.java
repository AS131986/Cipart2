import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void next() {
        Radio radic = new Radio();
        radic.setCurrentStation(9);
        int expected = 0;
        int actual = radic.next(radic.getCurrentStation());

        assertEquals(expected, actual);

    }

    @Test
    public void nextStation() {
        Radio radic = new Radio();
        radic.setCurrentStation(0);
        int expected = 1;
        int actual = radic.next(radic.getCurrentStation());

        assertEquals(expected, actual);

    }

    @Test
    public void prev() {
        Radio radic = new Radio();
        radic.setCurrentStation(9);
        int expected = 8;
        int actual = radic.prev(radic.getCurrentStation());

        assertEquals(expected, actual);
    }

    @Test
    public void prevFirstToLast() {
        Radio radic = new Radio();
        radic.setCurrentStation(0);
        int expected = 9;
        int actual = radic.prev(radic.getCurrentStation());

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStation() {
        Radio radic = new Radio();
        radic.setCurrentStation(8);
        int expected = 8;
        int actual = radic.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationMoreLimit() {
        Radio radic = new Radio();
        radic.setCurrentStation(10);
        int expected = 0;
        int actual = radic.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void turnUpVolume() {
        Radio radic = new Radio();
        radic.setVolume(9);
        radic.turnUpVolume();
        int expected = 10;
        int actual = radic.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void turnUpVolumeMax() {
        Radio radic = new Radio();
        radic.setVolume(10);
        radic.turnUpVolume();
        int expected = 10;
        int actual = radic.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void turnDownVolume() {
        Radio radic = new Radio();
        radic.setVolume(9);
        radic.turnDownVolume();
        int expected = 8;
        int actual = radic.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void turnDownVolumeMin() {
        Radio radic = new Radio();
        radic.setVolume(0);
        radic.turnDownVolume();
        int expected = 0;
        int actual = radic.getVolume();

        assertEquals(expected, actual);
    }
}