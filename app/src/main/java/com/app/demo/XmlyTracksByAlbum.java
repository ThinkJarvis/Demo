package com.app.demo;

import java.util.List;

/**
 * The type Xmly Tracks by Album.
 */
public class XmlyTracksByAlbum {

    // http://cp.paas.pateo.com.cn/cp/radio/ondemand/albumsBrowse?devicetype=DT00000001&clientOsType=2&packId=com.ximalaya.ting.android.botaichezai
    // &deviceId=df529d6e9b56c15b&albumId=2667276&sort=asc&page=1&count=1

    /**
     * data : {"cover_url_large":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_large.jpg","album_intro":"郭德纲相声十年经典之一 ","cover_url_small":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_small.jpg","total_count":"963","tracks":[{"comment_count":"116","announcer":{"avatar_url":"http://fdfs.xmcdn.com/group1/M00/0B/3D/wKgDrlESHqyTqakZAADewk1yMt8360_web_large.jpg","kind":"user","nickname":"郭德纲相声","id":"1000202"},"cover_url_small":"http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_mobile_small.jpg","play_url_24_m4a":"http://audio.xmcdn.com/group18/M02/76/57/wKgJJVf_YnCSYaV-ADo5kJuZqd4762.m4a","created_at":"1476354698000","source":"1","cover_url_middle":"http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_web_large.jpg","play_url_64":"http://fdfs.xmcdn.com/group18/M02/75/A9/wKgJKlf_YnOjZJYbAJZ0-q82s7k951.mp3","duration":"1232","track_intro":"郭德纲相声十年经典之一","category_id":"12","updated_at":"1486211409000","download_url":"http://download.xmcdn.com/group18/M02/76/57/wKgJJVf_YnCSYaV-ADo5kJuZqd4762.m4a","favorite_count":"586","id":"23167397","play_size_64":"9860346","cover_url_large":"http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_mobile_large.jpg","kind":"track","play_url_64_m4a":"http://audio.xmcdn.com/group18/M02/75/AA/wKgJKlf_Yn_zGKRDAJhD5Vc-_5w755.m4a","track_title":"2010高清《双背地理图》","play_count":"641571","play_url_32":"http://fdfs.xmcdn.com/group18/M02/76/56/wKgJJVf_Ymqix2ZeAEs6nJIcMQQ174.mp3","track_tags":"相声,郭德纲,郭德纲相声,相声大全,郭德纲于谦","download_count":"0","play_size_24_m4a":"3815824","subordinated_album":{"cover_url_large":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_large.jpg","cover_url_small":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_small.jpg","id":"2667276","album_title":"郭德纲相声十年经典","cover_url_middle":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_meduim.jpg"},"play_size_64_m4a":"9978853","download_size":"3815824","play_size_32":"4930204","can_download":true}],"cover_url_middle":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_meduim.jpg","category_id":"12","total_page":"963","album_id":"2667276","can_download":true,"current_page":"1","album_title":"郭德纲相声十年经典"}
     * statusMessage : 成功
     * statusCode : 0
     */

    private DataBean data;
    private String statusMessage;
    private String statusCode;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public static class DataBean {
        /**
         * cover_url_large : http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_large.jpg
         * album_intro : 郭德纲相声十年经典之一
         * cover_url_small : http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_small.jpg
         * total_count : 963
         * tracks : [{"comment_count":"116","announcer":{"avatar_url":"http://fdfs.xmcdn.com/group1/M00/0B/3D/wKgDrlESHqyTqakZAADewk1yMt8360_web_large.jpg","kind":"user","nickname":"郭德纲相声","id":"1000202"},"cover_url_small":"http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_mobile_small.jpg","play_url_24_m4a":"http://audio.xmcdn.com/group18/M02/76/57/wKgJJVf_YnCSYaV-ADo5kJuZqd4762.m4a","created_at":"1476354698000","source":"1","cover_url_middle":"http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_web_large.jpg","play_url_64":"http://fdfs.xmcdn.com/group18/M02/75/A9/wKgJKlf_YnOjZJYbAJZ0-q82s7k951.mp3","duration":"1232","track_intro":"郭德纲相声十年经典之一","category_id":"12","updated_at":"1486211409000","download_url":"http://download.xmcdn.com/group18/M02/76/57/wKgJJVf_YnCSYaV-ADo5kJuZqd4762.m4a","favorite_count":"586","id":"23167397","play_size_64":"9860346","cover_url_large":"http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_mobile_large.jpg","kind":"track","play_url_64_m4a":"http://audio.xmcdn.com/group18/M02/75/AA/wKgJKlf_Yn_zGKRDAJhD5Vc-_5w755.m4a","track_title":"2010高清《双背地理图》","play_count":"641571","play_url_32":"http://fdfs.xmcdn.com/group18/M02/76/56/wKgJJVf_Ymqix2ZeAEs6nJIcMQQ174.mp3","track_tags":"相声,郭德纲,郭德纲相声,相声大全,郭德纲于谦","download_count":"0","play_size_24_m4a":"3815824","subordinated_album":{"cover_url_large":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_large.jpg","cover_url_small":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_small.jpg","id":"2667276","album_title":"郭德纲相声十年经典","cover_url_middle":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_meduim.jpg"},"play_size_64_m4a":"9978853","download_size":"3815824","play_size_32":"4930204","can_download":true}]
         * cover_url_middle : http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_meduim.jpg
         * category_id : 12
         * total_page : 963
         * album_id : 2667276
         * can_download : true
         * current_page : 1
         * album_title : 郭德纲相声十年经典
         */

        private String cover_url_large;
        private String album_intro;
        private String cover_url_small;
        private String total_count;
        private String cover_url_middle;
        private String category_id;
        private String total_page;
        private String album_id;
        private boolean can_download;
        private String current_page;
        private String album_title;
        private List<TracksBean> tracks;

        public String getCover_url_large() {
            return cover_url_large;
        }

        public void setCover_url_large(String cover_url_large) {
            this.cover_url_large = cover_url_large;
        }

        public String getAlbum_intro() {
            return album_intro;
        }

        public void setAlbum_intro(String album_intro) {
            this.album_intro = album_intro;
        }

        public String getCover_url_small() {
            return cover_url_small;
        }

        public void setCover_url_small(String cover_url_small) {
            this.cover_url_small = cover_url_small;
        }

        public String getTotal_count() {
            return total_count;
        }

        public void setTotal_count(String total_count) {
            this.total_count = total_count;
        }

        public String getCover_url_middle() {
            return cover_url_middle;
        }

        public void setCover_url_middle(String cover_url_middle) {
            this.cover_url_middle = cover_url_middle;
        }

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public String getTotal_page() {
            return total_page;
        }

        public void setTotal_page(String total_page) {
            this.total_page = total_page;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public boolean isCan_download() {
            return can_download;
        }

        public void setCan_download(boolean can_download) {
            this.can_download = can_download;
        }

        public String getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(String current_page) {
            this.current_page = current_page;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public List<TracksBean> getTracks() {
            return tracks;
        }

        public void setTracks(List<TracksBean> tracks) {
            this.tracks = tracks;
        }

        public static class TracksBean {
            /**
             * comment_count : 116
             * announcer : {"avatar_url":"http://fdfs.xmcdn.com/group1/M00/0B/3D/wKgDrlESHqyTqakZAADewk1yMt8360_web_large.jpg","kind":"user","nickname":"郭德纲相声","id":"1000202"}
             * cover_url_small : http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_mobile_small.jpg
             * play_url_24_m4a : http://audio.xmcdn.com/group18/M02/76/57/wKgJJVf_YnCSYaV-ADo5kJuZqd4762.m4a
             * created_at : 1476354698000
             * source : 1
             * cover_url_middle : http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_web_large.jpg
             * play_url_64 : http://fdfs.xmcdn.com/group18/M02/75/A9/wKgJKlf_YnOjZJYbAJZ0-q82s7k951.mp3
             * duration : 1232
             * track_intro : 郭德纲相声十年经典之一
             * category_id : 12
             * updated_at : 1486211409000
             * download_url : http://download.xmcdn.com/group18/M02/76/57/wKgJJVf_YnCSYaV-ADo5kJuZqd4762.m4a
             * favorite_count : 586
             * id : 23167397
             * play_size_64 : 9860346
             * cover_url_large : http://fdfs.xmcdn.com/group16/M05/32/79/wKgDalWSb8Hja97XAAHQGDUsfAE893_mobile_large.jpg
             * kind : track
             * play_url_64_m4a : http://audio.xmcdn.com/group18/M02/75/AA/wKgJKlf_Yn_zGKRDAJhD5Vc-_5w755.m4a
             * track_title : 2010高清《双背地理图》
             * play_count : 641571
             * play_url_32 : http://fdfs.xmcdn.com/group18/M02/76/56/wKgJJVf_Ymqix2ZeAEs6nJIcMQQ174.mp3
             * track_tags : 相声,郭德纲,郭德纲相声,相声大全,郭德纲于谦
             * download_count : 0
             * play_size_24_m4a : 3815824
             * subordinated_album : {"cover_url_large":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_large.jpg","cover_url_small":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_small.jpg","id":"2667276","album_title":"郭德纲相声十年经典","cover_url_middle":"http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_meduim.jpg"}
             * play_size_64_m4a : 9978853
             * download_size : 3815824
             * play_size_32 : 4930204
             * can_download : true
             */

            private String comment_count;
            private AnnouncerBean announcer;
            private String cover_url_small;
            private String play_url_24_m4a;
            private String created_at;
            private String source;
            private String cover_url_middle;
            private String play_url_64;
            private String duration;
            private String track_intro;
            private String category_id;
            private String updated_at;
            private String download_url;
            private String favorite_count;
            private String id;
            private String play_size_64;
            private String cover_url_large;
            private String kind;
            private String play_url_64_m4a;
            private String track_title;
            private String play_count;
            private String play_url_32;
            private String track_tags;
            private String download_count;
            private String play_size_24_m4a;
            private SubordinatedAlbumBean subordinated_album;
            private String play_size_64_m4a;
            private String download_size;
            private String play_size_32;
            private boolean can_download;

            public String getComment_count() {
                return comment_count;
            }

            public void setComment_count(String comment_count) {
                this.comment_count = comment_count;
            }

            public AnnouncerBean getAnnouncer() {
                return announcer;
            }

            public void setAnnouncer(AnnouncerBean announcer) {
                this.announcer = announcer;
            }

            public String getCover_url_small() {
                return cover_url_small;
            }

            public void setCover_url_small(String cover_url_small) {
                this.cover_url_small = cover_url_small;
            }

            public String getPlay_url_24_m4a() {
                return play_url_24_m4a;
            }

            public void setPlay_url_24_m4a(String play_url_24_m4a) {
                this.play_url_24_m4a = play_url_24_m4a;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getCover_url_middle() {
                return cover_url_middle;
            }

            public void setCover_url_middle(String cover_url_middle) {
                this.cover_url_middle = cover_url_middle;
            }

            public String getPlay_url_64() {
                return play_url_64;
            }

            public void setPlay_url_64(String play_url_64) {
                this.play_url_64 = play_url_64;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getTrack_intro() {
                return track_intro;
            }

            public void setTrack_intro(String track_intro) {
                this.track_intro = track_intro;
            }

            public String getCategory_id() {
                return category_id;
            }

            public void setCategory_id(String category_id) {
                this.category_id = category_id;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getDownload_url() {
                return download_url;
            }

            public void setDownload_url(String download_url) {
                this.download_url = download_url;
            }

            public String getFavorite_count() {
                return favorite_count;
            }

            public void setFavorite_count(String favorite_count) {
                this.favorite_count = favorite_count;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPlay_size_64() {
                return play_size_64;
            }

            public void setPlay_size_64(String play_size_64) {
                this.play_size_64 = play_size_64;
            }

            public String getCover_url_large() {
                return cover_url_large;
            }

            public void setCover_url_large(String cover_url_large) {
                this.cover_url_large = cover_url_large;
            }

            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public String getPlay_url_64_m4a() {
                return play_url_64_m4a;
            }

            public void setPlay_url_64_m4a(String play_url_64_m4a) {
                this.play_url_64_m4a = play_url_64_m4a;
            }

            public String getTrack_title() {
                return track_title;
            }

            public void setTrack_title(String track_title) {
                this.track_title = track_title;
            }

            public String getPlay_count() {
                return play_count;
            }

            public void setPlay_count(String play_count) {
                this.play_count = play_count;
            }

            public String getPlay_url_32() {
                return play_url_32;
            }

            public void setPlay_url_32(String play_url_32) {
                this.play_url_32 = play_url_32;
            }

            public String getTrack_tags() {
                return track_tags;
            }

            public void setTrack_tags(String track_tags) {
                this.track_tags = track_tags;
            }

            public String getDownload_count() {
                return download_count;
            }

            public void setDownload_count(String download_count) {
                this.download_count = download_count;
            }

            public String getPlay_size_24_m4a() {
                return play_size_24_m4a;
            }

            public void setPlay_size_24_m4a(String play_size_24_m4a) {
                this.play_size_24_m4a = play_size_24_m4a;
            }

            public SubordinatedAlbumBean getSubordinated_album() {
                return subordinated_album;
            }

            public void setSubordinated_album(SubordinatedAlbumBean subordinated_album) {
                this.subordinated_album = subordinated_album;
            }

            public String getPlay_size_64_m4a() {
                return play_size_64_m4a;
            }

            public void setPlay_size_64_m4a(String play_size_64_m4a) {
                this.play_size_64_m4a = play_size_64_m4a;
            }

            public String getDownload_size() {
                return download_size;
            }

            public void setDownload_size(String download_size) {
                this.download_size = download_size;
            }

            public String getPlay_size_32() {
                return play_size_32;
            }

            public void setPlay_size_32(String play_size_32) {
                this.play_size_32 = play_size_32;
            }

            public boolean isCan_download() {
                return can_download;
            }

            public void setCan_download(boolean can_download) {
                this.can_download = can_download;
            }

            public static class AnnouncerBean {
                /**
                 * avatar_url : http://fdfs.xmcdn.com/group1/M00/0B/3D/wKgDrlESHqyTqakZAADewk1yMt8360_web_large.jpg
                 * kind : user
                 * nickname : 郭德纲相声
                 * id : 1000202
                 */

                private String avatar_url;
                private String kind;
                private String nickname;
                private String id;

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getKind() {
                    return kind;
                }

                public void setKind(String kind) {
                    this.kind = kind;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }
            }

            public static class SubordinatedAlbumBean {
                /**
                 * cover_url_large : http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_large.jpg
                 * cover_url_small : http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_small.jpg
                 * id : 2667276
                 * album_title : 郭德纲相声十年经典
                 * cover_url_middle : http://fdfs.xmcdn.com/group6/M02/01/3E/wKgDhFUk65CB148cAAHQGDUsfAE500_mobile_meduim.jpg
                 */

                private String cover_url_large;
                private String cover_url_small;
                private String id;
                private String album_title;
                private String cover_url_middle;

                public String getCover_url_large() {
                    return cover_url_large;
                }

                public void setCover_url_large(String cover_url_large) {
                    this.cover_url_large = cover_url_large;
                }

                public String getCover_url_small() {
                    return cover_url_small;
                }

                public void setCover_url_small(String cover_url_small) {
                    this.cover_url_small = cover_url_small;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getAlbum_title() {
                    return album_title;
                }

                public void setAlbum_title(String album_title) {
                    this.album_title = album_title;
                }

                public String getCover_url_middle() {
                    return cover_url_middle;
                }

                public void setCover_url_middle(String cover_url_middle) {
                    this.cover_url_middle = cover_url_middle;
                }
            }
        }
    }
}
