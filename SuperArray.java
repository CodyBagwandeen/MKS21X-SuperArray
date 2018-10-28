public class SuperArray {
  private String[] data ;
  private int size ;

  public SuperArray(){
    data = new String[10];
  }

  public SuperArray(int startingCapacity){
    data = new String[10]
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

  String toStringDebug() {
    String output = "[";
    for ( int x = 0 ; x < data.length ; x++) {
      if ( x != data.length -1)
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
    String[] newData = new String[ (size * 2) + 1];
    for ( int x = 0 ; x < size; x ++) {
      newData[x] = data[x];
    }
    data = newData;
  }

  public boolean contains( String element) {
    for ( int x = 0; x < size; x++) {
      if (data[x].equals(element))
      return true;
    }
    return false;
  }

  public int indexOf( String target) {
    for ( int x = 0; x < size; x++) {
      if ( data[x].equals(target))
      return x;
    }
    return -1;
  }

  public int lastIndexOf( String target) {
    for ( int x = size - 1; x >= 0; x--) {
      if ( data[x].equals(target))
      return x;
    }
    return -1;
  }

  public void add( int index, String element) {
    if (index < 0 || index > size())
    System.out.println( "index out of bounds");
    else {
    if ( data.length <= size)
    reSize();
    String[] newData = new String[data.length];
    for( int x = 0; x < index; x++) {
      newData[x] = data[x];
    }
    newData[index] = element ;
    size++;
    for ( int x = index ; x < size + 1 ; x++){
      newData[x+1] = data[x];
    }
    data = newData;
  }
}

  public String remove( int index){
    if (index < 0 || index > size())
    System.out.println( "index out of bounds");
    String output = "";
    if ( !(index < 0 || index > size())) {
      String[] newData = new String[data.length];
      for( int x = 0; x < index; x++) {
        newData[x] = data[x];
      }
      output = data[index];
      size--;
      for ( int x = index; x < size; x++){
        newData[x] = data[x+1];
      }
      data = newData;
    }
    return output;
  }

  public boolean remove(String element) {
    if( contains(element)) {
      remove( indexOf(element));
      return true;
    }
    return ( contains(element));
  }


}
