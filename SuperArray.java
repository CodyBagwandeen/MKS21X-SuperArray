public class SuperArray {
  private String[] data ;
  private int size ;

  public SuperArray(){
    data = new String[10];
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean add( String element) {
    if ( data.length <= size)
    reSize();
      data[size] = element ;
      size++;
    return true;
  }

  public String toString() {
    String output = "[";
    for ( int x = 0 ; x < size ; x++) {
      if ( x != size -1)
      output += data[x] + ", ";
      else
      output += data[x];
    }
    return output + "]";
  }

  public String get( int index) {
    if (index < 0 || index >= size()) {
      return null;
    } else {
      return data[index];
    }
  }

  public String set( int index, String element) {
    String temp = "";
    if  (index < 0 || index >= size()) {
      return null;
    } else {
      temp = data[index];
      data[index] = element;
    }
    return temp;
  }

  private void reSize() {
    String[] newData = new String[ size * 2];
    for ( int x = 0 ; x < size; x ++) {
      newData[x] = data[x];
    }
    data = newData;
  }

}
