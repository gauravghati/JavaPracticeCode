package com.gauravghati;

import java.util.LinkedList;

class Album {
    private String name;
    private String artist;
    private SongList list;

    Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.list = new SongList();
    }

    void addSong(String title, double duration) {
        list.add(title,duration);
    }

    boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.list.findSong(trackNumber);
        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    void addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = list.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
        }
        System.out.println("The song " + title + " is not in this album");
    }

    private class SongList{

        private LinkedList<Song> songList;

        SongList() {
            this.songList = new LinkedList<>();
        }

        private Song findSong(String title) {
            for(Song checkedSong: this.songList) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if((index >=0) && (index <= this.songList.size())) {
                return songList.get(index);
            }
            return null;
        }

        private void add(String title, double duration) {
            if (list.findSong(title) == null) {
                this.songList.add(new Song(title, duration));
            }
        }
    }
}
