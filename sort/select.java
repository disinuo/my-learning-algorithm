public void selectSort() {
      for(int i=0;i<length;i++){
          int minIndex=i;
          for(int j=i+1;j<length;j++){
              if(array[j]<min){
                  minIndex=j;
              }
          }
          int temp=array[i];
          array[i]=array[minIndex];
          array[minIndex]=temp;
      }
  }
