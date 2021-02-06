package ru.netology.domain;
        public class Radio {

                private int currentStation;
                private int maxStation = 9;
                private int minStation = 0;
                private int currentVolume;
                private int maxVolume = 10;
                private int minVolume = 0;

                public int getCurrentStation() {
                        return currentStation;
                }

                public void setCurrentStation(int currentStation) {
                        if (currentStation > maxStation) {
                                return;
                        }
                        if (currentStation < minStation) {
                                return;
                        }
                        this.currentStation = currentStation;
                }

                public void nextRadioStation() {
                        int currentStation = this.getCurrentStation();
                        if (currentStation == maxStation) {
                                this.currentStation = minStation;
                                return;
                        }
                        this.currentStation++;
                }

                public void prevRadioStation() {
                        int currentStation = this.getCurrentStation();
                        if (currentStation == minStation) {
                                this.currentStation = maxStation;
                                return;
                        }
                        this.currentStation--;
                }

                public void inputRadioStation(int RadioStation) {
                        if (RadioStation > maxStation) {
                                return;
                        }
                        if (RadioStation < minStation) {
                                return;
                        }
                        this.currentStation = RadioStation;
                }

                public int getCurrentVolume() {
                        return currentVolume;
                }

                public void setCurrentVolume(int currentVolume) {
                        if (currentVolume > maxVolume) {
                                return;
                        }
                        if (currentVolume < minVolume) {
                                return;
                        }
                        this.currentVolume = currentVolume;
                }

                public void soundVolumePlus() {
                        int currentVolume = this.getCurrentVolume();
                        if (currentVolume >= maxVolume) {
                                return;
                        }
                        this.currentVolume++;
                }

                public void soundVolumeMinus() {
                        int currentVolume = this.getCurrentVolume();
                        if (currentVolume <= minVolume) {
                                return;
                        }
                        this.currentVolume--;
                }

}
