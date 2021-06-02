package homework;

public class Rent extends RentService{
String name;
String title;
String date;
public Rent() {
	super();
}

public Rent(String name, String title) {
	super();
	this.name=name;
	this.title=title;
}

public Rent(String name, String title, String date) {
	super();
	this.name=name;
	this.title=title;
	this.date=date;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

@Override
public String toString() {
	return "Rent [name=" + name + ", title=" + title + ", date=" + date + "]";
}





}
