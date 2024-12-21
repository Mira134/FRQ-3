class Patron {
private String name;
private int id;
private List<item> checkedOutItems;

public Patron(String name, int id) {
this.name = name;
this.id = id;
this.checkedOutItems = new ArrayLists<>();
}

public String getName() {
return name;
}

public int getId() {
return id;
}

public List<Item>  getCheckedOutItems() {
return checkedOutItems;
}

public void checkOutItems(Item item) {
If (checkedOutItems.size() < 10) {
checkedOutItems.add(item);
}
}

public void returnItem(Item item) {
checkedOutItems.remove(item);
}

public int getNumItemsCheckedOut() {
return checkedOutItem.size();
}
public String getCheckedOutItemsString() {
StringBuilder sb = new StringBuilder():
For (Item item : checkedOutItems) {
sb.append(item.toString()).append(“\n”);
}
return sb.toString();
}

public double getTotalLateFees() {
double totalLateFees = 0.0;
For (Item item : checkedOutItems) {
If (item.isOverdue()) {
totalLateFees += item.getLateFee():
}
}
Return totalLateFees;
}
