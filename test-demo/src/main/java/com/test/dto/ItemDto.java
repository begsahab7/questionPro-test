package com.test.dto;

import java.time.LocalDateTime;
import java.util.Arrays;

import lombok.Data;

//@Data
public class ItemDto implements Comparable<ItemDto> {


String id;	
String deleted;	
String type;	
String by;	
String time;	
String text	;
String dead	;
String parent;	
String poll	;
Object[] kids	;
String url	;
Integer score;	
String title;	
String parts;	
String descendants;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDeleted() {
	return deleted;
}
public void setDeleted(String deleted) {
	this.deleted = deleted;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getBy() {
	return by;
}
public void setBy(String by) {
	this.by = by;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public String getDead() {
	return dead;
}
public void setDead(String dead) {
	this.dead = dead;
}
public String getParent() {
	return parent;
}
public void setParent(String parent) {
	this.parent = parent;
}
public String getPoll() {
	return poll;
}
public void setPoll(String poll) {
	this.poll = poll;
}
public Object[] getKids() {
	return kids;
}
public void setKids(Object[] kids) {
	this.kids = kids;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Integer getScore() {
	return score;
}
public void setScore(Integer score) {
	this.score = score;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getParts() {
	return parts;
}
public void setParts(String parts) {
	this.parts = parts;
}
public String getDescendants() {
	return descendants;
}
public void setDescendants(String descendants) {
	this.descendants = descendants;
}
@Override
public String toString() {
	return "ItemDto [id=" + id + ", deleted=" + deleted + ", type=" + type + ", by=" + by + ", time=" + time + ", text="
			+ text + ", dead=" + dead + ", parent=" + parent + ", poll=" + poll + ", kids=" + Arrays.toString(kids)
			+ ", url=" + url + ", score=" + score + ", title=" + title + ", parts=" + parts + ", descendants="
			+ descendants + "]";
}
@Override
public int compareTo(ItemDto o) {
	return this.score.compareTo(o.score);
	
}


}
