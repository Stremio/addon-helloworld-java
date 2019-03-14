package com.stremio.javaaddon.exampleaddon;
import java.util.Vector;


    public class Subtitles {
        Vector<Pair> subtitles = new Vector<Pair>();
        public void add(String lang, String url) {
            subtitles.add(new Pair(lang,url));
        }
        /**
         * @return the subtitles
         */
        public Vector<Pair> getSubtitles() {
            return subtitles;
        }
    
    public class Pair {
        String lang;
        String url;
        public Pair(String lang, String url) {
            this.lang = lang;
            this.url = url;
        }
        /**
         * @return the lang
         */
        public String getLang() {
            return lang;
        }
        /**
         * @return the url
         */
        public String getUrl() {
            return url;
        }
    }
    }