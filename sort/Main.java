class Main {
  public static void main(String[] args){
      int[] array={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
      Main ele=new Main(array);
      ele.printArray();
      ele.quickSort();
      ele.printArray();
  }
  public void printArray(){
      for(int x:array){
          System.out.print(x+" ");
      }
      System.out.println();
  }

  public Main(int[] array){
      this.array=array;
      this.length=array.length;
  }
  private int[] array;
  private int length;
}
