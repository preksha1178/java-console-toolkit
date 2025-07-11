import java.util.*;
class array
{
    Scanner x = new Scanner(System.in);
    int arr[] = new int[20];
    int n;
    int i , j;
   void choose()
   {
     System.out.print("\n\t\t\t\t\tEnter Size of Array[20] -- ");
     n=x.nextInt();
     if(n>20)
     {
      System.out.println("\t\t\t\t\tInvalid Size of Array Please Choose again!!");
     choose();
     }
     System.out.println("\n\t\t\t\t\tEnter "+ n + " Array Elements -- ");
     for(i=0;i<n;i++)
     {
        System.out.print("\t\t\t\t\tEnter Element at " + "[" +i+"] : ");
        arr[i]=x.nextInt();
     }
     System.out.print("\n\t\t\t\t\tArray Elements are -- ");
     for(i=0;i<n;i++)
     System.out.print(arr[i] + " ");
     select();
     
   }
   void select()
   {
       System.out.print("\033[H\033[2J");
       System.out.flush();
       System.out.println("\n\t\t\t\t\tSelect Operation You Want to perform -- ");
       System.out.println("\n\t\t\t\t\t1.Insertion ");
       System.out.println("\t\t\t\t\t2.Deletion ");
       System.out.println("\t\t\t\t\t3.Modification ");
       System.out.println("\t\t\t\t\t4.Traversing ");
       System.out.println("\t\t\t\t\t5.Sorting ");
       System.out.println("\t\t\t\t\t6.Searching ");
       System.out.println("\t\t\t\t\t7.Exit ");

       System.out.println("\n\n-> Want to Go Back [Press b]");
       char m;
        m = x.next().charAt(0);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(m == '1')
        Insertion();
         else if(m == '2')
        Deletion();
         else if(m == '3')
        Modification();
        else if(m == '4')
        Traversing();
         else if(m == '5')
        Sorting();
         else if(m == '6')
        Searching();
        else if (m=='b')
        {
          arr a = new arr();
          a.main(null);
        }
        else if (m=='7')
        {
          return;
        }
        else
        {
          select();
        }
        System.out.printf("\n\n\n\n\t\t\t\t\t-> Want To Continue This Program? [Press 'y'] ");
        System.out.printf("\n\t\t\t\t\t-> Want to Continue From Starting with a new Array? [Press 'n'] ");
        System.out.printf("\n\t\t\t\t\t-> Want to Continue From Starting ? [Press 's']");
        System.out.printf("\n\t\t\t\t\t-> for Exit the Program Press Any key ");
                char d;
                d = x.next().charAt(0);
                if(d=='y'||d=='Y'){
                   System.out.print("\033[H\033[2J");
                   System.out.flush();
                   select();
                    
                }
                else if(d=='n'||d=='N')
                {
                  System.out.print("\033[H\033[2J");
                  System.out.flush();
                  choose();
                    
                }
                else if(d=='s'||d=='S')
                {
                  System.out.print("\033[H\033[2J");
                   System.out.flush();
                  arr a = new arr();
                  a.main(null);
                }
                else{
                        System.out.printf("\n\n\n\t\t\t\t\tThankyouuu For Your Precious Time !!\n\n");
                }
    }
      
    void Insertion()
    {
      System.out.println("\n\t\t\t\t\t<---INSERTION--->");
      System.out.println("\n\t\t\t\t\tChoose any one operation : ");
      System.out.println("\n\t\t\t\t\t1.At Beginning \n\t\t\t\t\t2.At End \n\t\t\t\t\t3.At Particular Position");
      System.out.println("\n\n-> Want to Go Back [Press b]");
      char ne;
      ne = x.next().charAt(0);
      System.out.print("\033[H\033[2J");
      System.out.flush();
      if(ne=='1')
      {
        System.out.println("\n\t\t\t\t\t<---INSERTION AT BEGINNING--->");
        System.out.print("\n\n\t\t\t\t\tEnter The Element to be inserted: ");
        int num = x.nextInt();
        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = num;
        n=n+1;
        System.out.print("\n\t\t\t\t\tAfter Insertion of Element at the Beginning of Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
      }
      else if(ne=='2')
      {
        System.out.println("\n\t\t\t\t\t<---INSERTION AT END--->");
        System.out.print("\n\n\t\t\t\t\tEnter The Element to be inserted: ");
        int num = x.nextInt();
              n = n + 1;
              arr[n-1]=num;
        System.out.print("\n\t\t\t\t\tAfter Insertion of Element at the end of Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
      }
      else if(ne=='3')
      {
        int pos;
        System.out.println("\n\t\t\t\t\t<---INSERTION AT PARTICULAR POSITION--->");
        System.out.print("\n\n\t\t\t\t\tEnter The Element to be inserted: ");
        int num = x.nextInt();
        System.out.print("\n\t\t\t\t\tEnter position: ");
        pos = x.nextInt();

        if(pos>n){
                System.out.println("\t\t\t\t\tInvalid Position!!");
                System.out.print("\n\t\t\t\t\tEnter Position -- ");
        pos = x.nextInt();
        }
        for(i=n;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        n=n+1;
        arr[pos]=num;
         System.out.print("\n\t\t\t\t\tAfter Insertion of Element at Particular Position of Array :- ");
         for(i=0;i<n;i++)
         System.out.print(arr[i] +  " ");
      }
      else if (ne=='b')
      {
          select();
      }
      else
      {
        Insertion();  
        System.out.println("\n\n\t\t\t\t\tChoose valid option !! ");
        
      }
   }
    void Deletion()
    {
      System.out.println("\n\t\t\t\t\t<---DELETION--->");
      System.out.println("\n\t\t\t\t\tChoose any one operation -- ");
      System.out.println("\n\t\t\t\t\t1.At Beginning \n\t\t\t\t\t2.At End \n\t\t\t\t\t3.At Particular Position");
      System.out.println("\n\n-> Want to Go Back [Press b]");
      char ne;
      ne = x.next().charAt(0);
      System.out.print("\033[H\033[2J");
      System.out.flush();
      if(ne=='1')
      {
        System.out.println("\n\t\t\t\t\t<---DELETION AT BEGINNING--->");
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i + 1];        }
            n=n-1;
        System.out.print("\n\t\t\t\t\tAfter Deletion of Element at the Beginning of Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
      }
      else if(ne=='2')
      {
         System.out.println("\n\t\t\t\t\t<---DELETION AT END--->");
              n=n-1;
        System.out.print("\n\t\t\t\t\tAfter Deletion of Element at the end of Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
      }
      else if(ne=='3')
      {
         System.out.println("\n\t\t\t\t\t<---DELETION AT PARTICULAR POSITION--->");
        int pos;
        System.out.print("\n\t\t\t\t\tEnter position: ");
        pos = x.nextInt();
        if(pos>n){
                System.out.println("\n\t\t\t\t\tInvalid Position!!");
                System.out.print("\n\t\t\t\t\tEnter Position -- ");
        pos = x.nextInt();
        }
        for(i=pos;i<n;i++){
            arr[i]=arr[i+1];
        }
        n=n-1;
         System.out.print("\n\t\t\t\t\tAfter Deletion of Element at Particular Position of Array :- ");
         for(i=0;i<n;i++)
         System.out.print(arr[i] + " ");
            
      }
      else if (ne == 'b')
      select();
      else
       {
        Deletion();  
        System.out.println("\n\t\t\t\t\tChoose valid option !! ");
        
      }
    }
    void Modification()
    {
       System.out.println("\n\t\t\t\t\t<---MODIFICATION---> ");
        int num,index,i;
    System.out.print("\n\t\t\t\t\tEnter the index of element to modify :- ");
    index=x.nextInt();
    if(index>n){
    System.out.printf("\n\t\t\t\t\tInvalid index!!");
    System.out.printf("\n\n\t\t\t\t\tEnter the index of element to modify :- ");
    index=x.nextInt();
    }
    System.out.printf("\n\t\t\t\t\tEnter the data :- ");
     num=x.nextInt();
    for(i=0;i<n;i++)
        arr[index]=num;
    System.out.printf("\n\t\t\t\t\tAfter Modifying Array Elements are :- ");
     for(i=0;i<n;i++)
        System.out.printf("%d ",arr[i]);
    }
    void Traversing()
    {
      System.out.printf("\n\t\t\t\t\t<---TRAVERSING--->\n");
         System.out.printf("\n\t\t\t\t\tArray Elements are :- ");
        for(i=0;i<n;i++)
        System.out.printf("%d ",arr[i]);
    }
    void Sorting()
    {
       System.out.println("\n\t\t\t\t\t<---SORTING---> ");
   System.out.printf("\n\t\t\t\t\tWhat do you want:-");
   System.out.printf("\n\n\t\t\t\t\t1.Selection Sort\n\t\t\t\t\t2.Bubble Sort\n\t\t\t\t\t3.Insertion Sort  ");
   System.out.println("\n\n-> Want to Go Back [Press b]");
   int t;
   char d;
   d = x.next().charAt(0);
   if(d=='1')
   {
    System.out.print("\033[H\033[2J");
       System.out.flush();
    System.out.println("\n\t\t\t\t\t<--- SELECTION SORT --->");
      for(i=0; i<n;i++){
        for(j=i+1; j<n; j++){
                if( arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    }
        }
                    }
                    System.out.printf("\n\t\t\t\t\tAfter Selection Sorting Array Elements are :- ");
                    for( i =0; i<n;i++){
                        System.out.printf("%d ",arr[i]);

      }
      }
      else if(d=='2')
      {
        System.out.print("\033[H\033[2J");
       System.out.flush();
    System.out.println("\n\t\t\t\t\t<--- BUBBLE SORT --->");
          for(i=0;i<n-1;i++){
            for(j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
          }
           System.out.printf("\n\t\t\t\t\tAfter Bubble Sorting Array Elements are :- ");
                    for( i=0; i<n;i++){
                        System.out.printf("%d ",arr[i]);
      }
    }
    else if(d=='3')
      {
        System.out.print("\033[H\033[2J");
       System.out.flush();
    System.out.println("\n\t\t\t\t\t<--- INSERTION SORT --->");
        int  t1;
          for(i=0;i<n;i++){
            t=arr[i];
            for(j=i;j>0;j--){
                if(t<arr[j-1]){
                    t1=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t1;
                }
            }
          }
           System.out.printf("\n\t\t\t\t\tAfter Insertion Sorting Array Elements are :- ");
                    for( i=0; i<n;i++){
                        System.out.printf("%d ",arr[i]);
      }
    }
    else if (d=='b')
    select();
else
       {
        System.out.println("\n\t\t\t\t\tChoose valid option !! ");
          Sorting();  
        
       }
    }
    void Searching()
    {
      int t;
       System.out.println("\n\t\t\t\t\t<---SEARCHING---> ");
         int i,data,cnt=0;
         System.out.printf("\n\t\t\t\t\tEnter Data you want to search :- ");
        data = x.nextInt();
   System.out.printf("\n\t\t\t\t\tWhat do you want:-");
   System.out.printf("\n\n\t\t\t\t\t1.Linear Searching\n\t\t\t\t\t2.Binary Searching ");
   System.out.println("\n\n-> Want to Go Back [Press b]");
   char d;
   d = x.next().charAt(0);
   if(d=='1')
   {
    System.out.print("\033[H\033[2J");
       System.out.flush();
    System.out.println("\n\t\t\t\t\t<--- LINEAR SEARCH ---> ");
      for(i=0;i<n;i++){
        if(arr[i]==data){
                cnt++;
                System.out.printf("\n\n\t\t\t\t\tData Found !! ");
        System.out.printf("\n\t\t\t\t\tIndex no. : %d  Element : %d",i,arr[i]);
        break;
        }
    }
        if(cnt==0)
        System.out.printf("\n\n\t\t\t\t\tData Not Found !! ");

   }
  else if(d=='2')
   {
    System.out.print("\033[H\033[2J");
       System.out.flush();
    System.out.println("\n\t\t\t\t\t<--- BINARY SEARCH ---> ");
       for(i=0; i<n;i++){
        for(j=i+1; j<n; j++){
                if( arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    }
        }
                    }
    int m,S,E;
     S=0;
     E=n-1;
     m=(E+S)/2;
    while(true)
    {
      if(arr[m]==data)
      {
        cnt=1;
        System.out.println("\n\n\t\t\t\t\tData Found !! ");
        break;
      }
      if(data>arr[m])
      {
        S=m+1;
      }
      else
      {
        E=m-1;
      }
      m=(E+S)/2;
      if(S>E)
      break;
    }
      if(cnt==0)
      System.out.println("\n\n\t\t\t\t\tData Not Found  !! ");
   }
   else if (d=='3')
   {
   select();
   }
   else
       {
        System.out.println("\n\n\t\t\t\t\tChoose valid option !! ");
          Sorting();  
        
       }

   
    }
}
class str
{
  Scanner x = new Scanner(System.in);
 String s = new String();
 void choose()
   {
    System.out.print("\n\t\t\t\t\tEnter String --  ");
     s=x.nextLine();
     System.out.print("\n\n\t\t\t\t\tYour String is -- " + s );
     select();
     
   }
   void select()
   {
       System.out.print("\033[H\033[2J");
       System.out.flush();
       System.out.println("\n\t\t\t\t\tSelect Operation You Want to perform -- ");
       System.out.println("\n\t\t\t\t\t1.Find Length of String ");
       System.out.println("\t\t\t\t\t2.Reverse the String ");
       System.out.println("\t\t\t\t\t3.Find Index & value at Particular Index");
       System.out.println("\t\t\t\t\t4.Compare String to Another one ");
       System.out.println("\t\t\t\t\t5.Convert Case ");
       System.out.println("\t\t\t\t\t6.Concatenation ");
       System.out.println("\t\t\t\t\t7.Exit ");
       System.out.println("\n\n -> Want to Go Back [Press b] ");
       char m;
        m = x.next().charAt(0);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(m == '1')
        length();
        else if(m == '2')
        reverse();
        else if(m == '3')
        inval();
        else if(m == '4')
        comp();
        else if(m == '5')
        casee();
        else if(m == '6')
        conct();
         else if (m=='b')
        {
          arr a = new arr();
          a.main(null);
        }
        else if (m=='7')
        return;
        else
        {
          System.out.println("Choose Following Options only :\n\n");
          select();
        }
        System.out.printf("\n\n\n\n\t\t\t\t\t-> Want To Continue This Program? [Press 'y'] ");
        System.out.printf("\n\t\t\t\t\t-> Want to Continue From Starting with a new String? [Press 'n'] ");
        System.out.printf("\n\t\t\t\t\t-> Want to Continue From Starting ? [Press 's']");
        System.out.printf("\n\t\t\t\t\t-> for Exit the Program Press Any key ");
                char d;
                d = x.next().charAt(0);
                if(d=='y'||d=='Y'){
                   System.out.print("\033[H\033[2J");
                   System.out.flush();
                   select();
                    
                }
                else if(d=='n'||d=='N')
                {
                  System.out.print("\033[H\033[2J");
                  System.out.flush();
                  choose();
                    
                }
                else if(d=='s'||d=='S')
                {
                  System.out.print("\033[H\033[2J");
                   System.out.flush();
                  arr a = new arr();
                  a.main(null);
                }
                else{
                        System.out.printf("\n\n\n\t\t\t\t\tThankyouuu For Your Precious Time !!\n\n");
                }
   }
                void length()
                {
                 System.out.println("\n\t\t\t\t\t<--- Length --->");
                 System.out.println("\n\n\t\t\t\t\tLength of " + s + " is : " + s.length());
                }
                void reverse()
                {
                  String reversed = ""; 
                  int ct=0; 
                  for(int i =0;i<s.length();i++)
                  {
                    if(s.charAt(i)==' ')
                    ct++;
                  }
                  if(ct==0)
                 {
                  System.out.println("\t\t\t\t\t<---- Reverse ----> ");
                 for(int i = s.length() - 1; i >= 0; i--) {
                reversed = reversed + s.charAt(i);
                }
                System.out.println("\n\n\t\t\t\t\tReversed string : " + reversed);
                }
                else
                {
                  System.out.println("\t\t\t\t\t<---- Reverse ----> ");
                  System.out.println("\n\t\t\t\t\tHow do you want to reverse your Multiword String ");
                  System.out.println("\n\t\t\t\t\t1.Reverse the Order of the Words in String ");
                  System.out.println("\n\t\t\t\t\t2.Reverse the Whole String ");
                  char m ;
                  m = x.next().charAt(0);
                  if(m=='1')
                  {
                  String[] words = s.split(" ");
                  StringBuilder reversede = new StringBuilder();
                  for(int i = words.length - 1; i >= 0; i--) {
                   reversede.append(words[i]).append(" "); 
                  }
                  System.out.println("\n\n\t\t\t\t\tReversed string : " + reversede.toString().trim());
                  }
                  else if(m=='2')
                  {
                     for(int i = s.length() - 1; i >= 0; i--) {
                     reversed = reversed + s.charAt(i);
                     }
                     System.out.println("\n\n\t\t\t\t\tReversed string : " + reversed);
                  }
                }
                }
                void inval()
                {
                System.out.println("\n\t\t\t\t\tWhat do You Want -- ");
                System.out.print("\n\t\t\t\t\t1.Find the index : ");
                System.out.print("\n\t\t\t\t\t2.Find the value at particular index : ");
                char m;
                m = x.next().charAt(0);
                if(m=='2')
                {
                  System.out.print("\n\n\t\t\t\t\tEnter index : ");
                  int in=x.nextInt();
                  System.out.println("\n\n\t\t\t\t\tThe String is "+s+"\n\t\t\t\t\t"+"The value at " + in + " index is : "+ s.charAt(in));

                }
                else if (m=='1')
                {
                 System.out.print("\n\n\t\t\t\t\tEnter String -- ");
                 String c = x.next();
                 System.out.println("\n\n\t\t\t\t\tThe String is "+s+"\n\t\t\t\t\t"+"The index of " + c +" is : " +s.indexOf(c) );
                }
                }
                void comp()
                {
                  System.out.println("\n\t\t\t\t\t<--- COMPARISON ---> ");
                  System.out.print("\n\n\t\t\t\t\tEnter String to be compared : ");
                  String str = x.next();
                  System.out.println("\n\t\t\t\t\tWhat Do You want -- ");
                  System.out.println("\n\t\t\t\t\t1.ignoreCase\t\t2.notToIgnoreCase");
                  char m ;
                  m = x.next().charAt(0);
                  if(m=='1')
                  {
                    System.out.println("\n\t\t\t\t\tyou have choosen ignoreCase !! "); 
                    System.out.println("\n\t\t\t\t\tComparison of " + s + " with " + str );
                    if(s.equalsIgnoreCase(str))
                    {
                      System.out.println("\n\n\t\t\t\t\tThe strings are equal");
                    }
                     else {
                      System.out.println("\n\n\t\t\t\t\tThe strings are not equal");
                    }
                    
                  }
                  else if (m=='2')
                  {
                      System.out.println("\n\t\t\t\t\tyou have choosen notToIgnoreCase ");
                      if(s.equals(str))
                    {
                      System.out.println("\n\n\t\t\t\t\tThe strings are equal");
                    }
                     else {
                      System.out.println("\n\n\t\t\t\t\tThe strings are not equal");
                    }
                  }
                }
                void conct()
                {
               System.out.println("\n\t\t\t\t\t<--- CONCATENATION ---> ");
               System.out.print("\n\n\t\t\t\t\tEnter String to be Concatenated : ");
               String str = x.next();
               System.out.println("\n\n\t\t\t\t\tConcatenation  : " + s + " " + str);
               }
                void casee()
                {
                  System.out.println("\n\t\t\t\t\t<--- CONVERT CASE ---> ");
                  System.out.println("\n\t\t\t\t\tWhat Do You Want -- ");
                  System.out.println("\n\t\t\t\t\t1.Convert into Lowercase\n\t\t\t\t\t2.Convert into Uppercase");
                  char m ;
                  m = x.next().charAt(0);
                  if(m=='2')
                  {
                  System.out.println("\n\t\t\t\t\tyou have choosen Uppercase: ");
                   System.out.println("\n\n\t\t\t\t\t" + s.toUpperCase());
                    
                  }
                  else if (m=='1')
                  {
                  System.out.println("\n\t\t\t\t\tyou have choosen Lowercase: ");
                   System.out.println("\n\n\t\t\t\t\t" + s.toLowerCase());
                      
                  }
                }
     
   }
class pattern
{
  Scanner x = new Scanner(System.in);
  int i,j,n;
  void choose()
   {
     System.out.print("\n\t\t\t\t\tEnter Size --  ");
     n=x.nextInt();
     select();
     
   }
   void select()
   {
       System.out.print("\033[H\033[2J");
       System.out.flush();
       System.out.println("\t\t\t\t\tChoose Pattern You want : ");
       System.out.println("\n\t\t\t\t\t1.Square Hollow Pattern ");
       System.out.println("\t\t\t\t\t2.Number Triangular");
       System.out.println("\t\t\t\t\t3.Zero-One Triangle");
       System.out.println("\t\t\t\t\t4.Hollow Triangle Pattern ");
       System.out.println("\t\t\t\t\t5.Triangle Star Pattern");
       System.out.println("\t\t\t\t\t6.Square Fill Pattern");
       System.out.println("\t\t\t\t\t7.Rhombus Pattern");
       System.out.println("\t\t\t\t\t8.Diamond Pattern");
       System.out.println("\t\t\t\t\t9.Number Increasing Pattern");
       System.out.println("\n\n -> Want to Go back [Press b]");
       System.out.println(" -> Exit [ Press 0 ] ");
       char m;
        m = x.next().charAt(0);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(m == '1')
        sqrehlw();
        else if(m == '2')
        nmber();
        else if(m == '3')
        zrone();
        else if(m == '4')
        hlwtr();
        else if(m == '5')
        trstr();
        else if(m == '6')
        sqfi();
         else if(m == '7')
        rom();
         else if(m == '8')
        dim();
         else if(m == '9')
        nmin();
         else if (m=='b')
        {
          arr a = new arr();
          a.main(null);
        }
        else if (m=='0')
         return;
        else
        {
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("\n\t\t\t\t\tChoose Following Options only :\n\n");
          select();
        }
        System.out.printf("\n\n\n\n\t\t\t\t\t-> Want To Continue This Program? [Press 'y'] ");
        System.out.printf("\n\t\t\t\t\t-> Want to Continue From Starting with a new size? [Press 'n'] ");
        System.out.printf("\n\t\t\t\t\t-> Want to Continue From Starting ? [Press 's']");
        System.out.printf("\n\t\t\t\t\t-> for Exit the Program Press Any key ");
                char d;
                d = x.next().charAt(0);
                if(d=='y'||d=='Y'){
                   System.out.print("\033[H\033[2J");
                   System.out.flush();
                   select();
                    
                }
                else if(d=='n'||d=='N')
                {
                  System.out.print("\033[H\033[2J");
                  System.out.flush();
                  choose();
                    
                }
                else if(d=='s'||d=='S')
                {
                  System.out.print("\033[H\033[2J");
                   System.out.flush();
                  arr a = new arr();
                  a.main(null);
                }
                else{
                        System.out.printf("\n\n\n\t\t\t\t\tThankyouuu For Your Precious Time !!\n\n");
                }
   }
   void sqrehlw()
   {
    System.out.println("\n\t\t\t\t\t<----Square Hollow Pattern---->\n\n");
      for(i=1;i<=n;i++)
      {
        System.out.print("\t\t\t\t\t\t");
        for(j=1;j<=n;j++)
        {
        if (i == 1|| j == 1 || i == n || j == n ) {
                    System.out.print("* ");

        }
        else
        {
          System.out.print("  ");
        }
      }
      System.out.println();
   }
}
void nmber()
{
    System.out.println("\n\t\t\t\t\t<----Number Triangular---->\n\n");
  for(i=1;i<=n;i++)
  {
    System.out.print("\t\t\t\t\t\t");
    for(j=1;j<=i;j++)
    {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
void zrone()
{
    System.out.println("\n\t\t\t\t\t<----Zero-One Triangle---->\n\n");
  int x =1;
  for(i=1;i<=n;i++)
  {
    System.out.print("\t\t\t\t\t\t");
    x=(i%2==0)?0:1;
    for(j=1;j<=i;j++)
    {
       System.out.print(x);
       x=(x==1)?0:1;
    }
    System.out.println();
  }
}
void hlwtr()
{
  System.out.println("\n\t\t\t\t\t<----Hollow Triangle Pattern---->\n\n");
  for(i=1;i<=n;i++)
  {
    System.out.print("\t\t\t\t\t\t");
    for(j=1;j<=i;j++)
    {
      if(j==1||j==i||i==n)
      System.out.print("* ");
      else
      System.out.print("  ");
    }
    System.out.println();
  }

}
void trstr()
{
  int x=0;
  System.out.println("\n\t\t\t\t\t<----Triangle Star Pattern---->\n\n");
  for(i=1;i<=n;i++,x++)
  {
    System.out.print("\t\t\t\t\t\t");
    System.out.print(" ".repeat(n-i));
    for(j=1;j<=i+x;j++)
    {
    System.out.print("*");
    }
    System.out.println();
  }

}
void sqfi()
{
  System.out.println("\n\t\t\t\t\t<----Square Fill Pattern---->\n\n");
  for(i=1;i<=n;i++)
  {
    System.out.print("\t\t\t\t\t\t");
    for(j=1;j<=n;j++)
    System.out.print("* ");
    System.out.println();
  }
}
void rom()
{
  System.out.println("\n\t\t\t\t\t<----Rhombus Pattern---->\n\n");
  for(i=1;i<=n;i++)
  {
    System.out.print("\t\t\t\t\t\t");
    System.out.print(" ".repeat(i-1));
    for(j=1;j<=n;j++)
    {
      System.out.print("*");

    }
    System.out.println();
  }
}
void dim()
{
  System.out.println("\n\t\t\t\t\t<----Diamond Pattern---->\n\n");
  for(i=1;i<=(n+n-1);i++)
  {
    System.out.print("\t\t\t\t\t\t");
    if(i<=n)
    {
      System.out.print(" ".repeat(n-i));
      for(j=1;j<=i;j++)
      System.out.print("* ");
    }
    else
    {
      System.out.print(" ".repeat(i-n));
      for(j=1;j<=(n+n-i);j++)
      System.out.print("* ");
    }
      System.out.println();

  }
}
void nmin()
{
  System.out.println("\n\t\t\t\t\t<----Number Increasing Pyramid---->\n\n");
  for(i=1;i<=n;i++)
  {
    System.out.print("\t\t\t\t\t\t");
    for(j=1;j<=i;j++)
    {
    System.out.print(j + " ");
    }
    
    System.out.println();
  }
}
// void rvrse()
// {
//   System.out.println("<----Reverse Triangle Pattern---->\n\n");
//   for(i=1;i<=n;i++)
//   {
//       System.out.print(" ".repeat(i-1));
//     for(j=1;j<=n-i+1;j++){
//       System.out.print("*");
//     }
//     System.out.println();
//   }
  
// }
}
class arr
{
    public static void main( String args[])
    {
        array a = new array();
        str s = new str();
        pattern p = new pattern();
        System.out.print("\n\t\t\t\t\tMake a Choice : ");
        System.out.println("\n\n\t1.Array \t\t\t  2.String \t\t\t3.Pattern ");
        Scanner x = new Scanner(System.in);
        char ch;
        ch = x.nextLine().charAt(0);
        if(ch == '1')
        {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n\t\t\t\t\tYou have Choosen Array !!");
        a.choose();
        }
         else if(ch == '2')
         {
         System.out.print("\033[H\033[2J");
         System.out.flush(); 
        System.out.println("\n\t\t\t\t\tYou have Choosen String !!");
        s.choose();
         }
         else if(ch == '3'){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n\t\t\t\t\tYou have Choosen Pattern !!");
         p.choose();
         }




    }
}