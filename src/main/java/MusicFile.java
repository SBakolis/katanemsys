public class MusicFile{
String trackName;
String artistName;
String albuminfo;
String genre;
byte[] musicFileExtract;
public MusicFile(){
trackName = "";
artistName = "";
albuminfo = "";
genre = "";
musicFileExtract = null;
}
public MusicFile(String trackName, String artistName, String albuminfo, String genre, byte[] musicFileExtract){
this.trackName = trackName;
this.artistName = artistName;
this.albuminfo = albuminfo;
this.genre = genre;
this.musicFileExtract = new byte[musicFileExtract.getLength()];
for(int i = 0; i < musicFileExtract.getLength(); i++){
this.musicFileExtract[i] = musicFileExtract[i];
}
}
public void setTrackName(String trackName){
this.trackName = trackName;
}
public void setArtistName(String artistName){
this.artistName = artistName;
}
public void setAlbuminfo(String albuminfo){
this.albuminfo = albuminfo;
}
public void setGenre(String genre){
this.genre = genre;
}
public void setMusicFileExtract(byte[] musicFileExtract){
this.musicFileExtract = new byte[musicFileExtract.getLength()];
for(int i = 0; i < musicFileExtract.getLength(); i++){
this.musicFileExtract[i] = musicFileExtract[i];
}
}
public String getTrackName(){
return trackName;
}
public String getArtistName(){
return artistName;
}
public String getAlbuminfo(){
return albuminfo;
}
public String getGenre(){
return genre;
}
public byte[] getMusicFileExtract(){
return musicFileExtract[];
}
}