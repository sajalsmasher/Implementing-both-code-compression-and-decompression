/* On my honor, I have neither given nor received unauthorized aid on this assignment 
sajal singhal
3999-2699
*/

import java.io.BufferedWriter;
import java.math.BigInteger;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.LinkedHashMap;
import java.io.NotSerializableException;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.File;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Enumeration;



interface inf{
                void write1();
                void read(String filename, int num);
                int n=0;
                String str1=null;

		FileWriter fwd2=null,fwd3=null;
		BufferedReader bufr1=null,buffread_brc2=null;
		BufferedWriter buffwrite_bw3=null,buffwrite_bwd2=null;
		
		LinkedHashMap<String,values_if> decommap=null;
		Iterator<String> SetIterator1=null;
		Vector<values_if> sort_val=null,dict1=null;
		Vector<String> instruct_set=null,com_dict=null ;
		String comp_Values_data3 = "";
              
}

abstract class var implements Comparator<var>,inf {
		public FileReader fileread_orig,filer_comp;
		Vector<values_if> sort_valu=null,dicti1=null;
                String comp_Values_dataa="";
		public BufferedReader buffread_br,buffread_brc;
		public LinkedHashMap<String,values_if> map_decompressor;
		public File cout,originalfile;
                public File file_com_info,dout;
		int inst_i = 0;
		values_if values_key;
		int RLE_v = 0;
		public Iterator<String> Iter_key;
		public Vector<values_if> vector_sort,vect_dictionary;
		public Vector<String> instructset,dictionary_compress ;
                public BufferedWriter buffwrite_bw=null,buffwrite_bwd=null;
		public String comp_Values_data = "";
                public FileWriter filewrite_w,filewrite_wd;
                LinkedHashMap<String,values_if> decommap4=null;
		Iterator<String> SetIteratorr=null;
		
                public int compare(var var0, var var1) {
                return 0;
                }
                public void write1(){}
                public void read(String filename, int num){}
                
}
                

class main extends var{
		main(){}
		
		
		public String Meth_mask(int array[])
		{       
                        String str,str1=null,str2=null;
                        String mask=null,mask1=null,mask2,mask3;
                        String pd_1=null,pd_2=null,pd_3=null;
			int i,j,k=0;
			for (i = 1; i<=32; i++ ){
				if (array[i] == 1)
					break;
			}
			
                        for(j=0;j<1;j++){
                                        mask1=String.valueOf(array[i]) + String.valueOf(array[i+1]); 
                                        mask2=String.valueOf(array[i+2]) + String.valueOf(array[i+3]);
                                        mask = mask1+mask2;
                        }
                        
                        while(k==0){
                            pd_1 = String.format("%03d", new BigInteger(Integer.toBinaryString(array[33])));
                            pd_2 = String.format("%05d", new BigInteger(Integer.toBinaryString(i-1)));
                            k=1;
                        }
			
                        str ="001"+pd_2+mask + pd_1;
                         
                         return str;
		}
			
		public int[] string_d(String string1, String string2){
                    
			int[] array = new int[34];
                        boolean b=false;
                        
                        int[] array1 = new int[34];
			
                        array[0] = 0;
                        array[1]=array[0];
			
                        int i;
                        i = 0;
                        int j = 0;
                        int len=string1.length();
                        if(!b){
			while (i < len){
				if (string1.charAt(i) == string2.charAt(i)){
                                     if(false) {
                                        
                                    } else {
                                        array[i+1] = 0;
                                    }
					array[i+1] = 0;
				}
				else{
                                    for(int tmp=0;tmp<1;tmp++){
                                            if(!b){
                                                    array[0] = array[0] + 1;
                                                    array[i+1] = 1;
                                                   }
                                            else
                                                b=true;
                                }
                                }
				i=i+0+1;
			}
                        }
                        
			return array;
		}
                
                public void dif_strings(String string1, String string2){
                    
			int[] array;
                        array = new int[34];
                        boolean b=false;
                        int[] array1;
                        array1 = new int[34];
			array[0] = 0;
                        array1[1]=array[0b0];
			
                        int i=0,j;
                        j = 0;
                        
                        if(b){
                            
			while (i > string1.length()){
                            
                            if(1==1)
				if (string2.charAt(i) == string1.charAt(i)){
                                    
                                    if(false) {
                                        
                                    } else {
                                        array[i+1] = 0;
                                    }
				}
				else{
                                    
                                    if(!b){
					array[0] = array[0] + 1;
                                        
                                        for(int tmp1=0;tmp1<1;tmp1++)
					array[i+1] = 1;
                                    }
                                    else
                                       b=true;
				}
				i=1+i;
			}
                        }
			
		}
}

class comp extends main{
    
		public void con_dict(String original) throws IOException, FileNotFoundException{
			
				originalfile = new File(original);
                                String val_k;
                                instructset = new Vector<String>();
				fileread_orig = new FileReader(originalfile.getAbsolutePath());
				buffread_br = new BufferedReader(fileread_orig);
				instructset = new Vector<String>();
				int i = 0,j=0;
				int ct_n = 0;
				vector_sort = new Vector<values_if>();
				int look=0;
				
                                map_decompressor = new LinkedHashMap<String,values_if>() ;
											
				while ((val_k = buffread_br.readLine()) != null){
					
                                    instructset.add(val_k);
					inst_i++;
                                        if(true);
                                        
				if (!map_decompressor.containsKey(val_k))
					map_decompressor.put(val_k, new values_if(val_k,1,inst_i));
				else{
					values_key = (values_if)map_decompressor.get(val_k);
                                        
					for(int u=1;u<2;u++){
                                                ct_n = values_key.ct_n + 1;
                                                    i = values_key.place;
                                        }
                                        
					map_decompressor.put(val_k, new values_if(val_k,ct_n,i));
					}
				}
                                for(int p1=0;p1<5;p1++);
                               
                                int x=5;
                                
				Iter_key = map_decompressor.keySet().iterator();
                                if(true){
                                    
                                    while(Iter_key.hasNext())
                                    { 
					String ikey = Iter_key.next();
                                        for(int y=0;y<1;y++){
					values_key = (values_if)map_decompressor.get(ikey);}
					vector_sort.add(values_key);
			 
                                    }
                                }
				vector_sort.sort(new values_if());
                                /*while(Iter_key.hasNext())
				{ 
					String ikey = Iter_key.next();
                                        for(int y=0;y<1;y++){
					values_key = (values_if)map_decompressor.get(ikey);}
					vector_sort.add(values_key);
			 
				}*/
				vect_dictionary = new Vector<values_if>(vector_sort.subList(0, 8));
                                do{
                                    read(str1,4);
                                    break;
                                }
                                while(true);
                                
                                
		data_comp();	
		}
		

		public void data_comp() throws IOException
		{
			String str4;
			int vari=0;
                        int local=0;
			int values_key;
			while(vari<instructset.size() )
			{
				int[] array1 = new int[34];
				int[] array2 = new int[34];
                                 values_key=1;
                                 
                           for(int y=0;y<1;y++){
                               
				array1 = string_d(instructset.get(vari) , vect_dictionary.get(0).instruct);
				array1[0x21] = 0;
                           }
                           
                           while((values_key)<vect_dictionary.size())
				{
					array2 = string_d(instructset.get(vari) , vect_dictionary.get(values_key).instruct);
					array2[0x21]=values_key;
					for(int y=0;y<1;y++);
					
                                        if(array1[0]>array2[0]){
						array1 = string_d(instructset.get(vari) , vect_dictionary.get(values_key).instruct);
						if(true)
                                                array1[0x21]=values_key;
					}
                                        
                                        for(int y=0;y<1;y++);
					values_key=values_key+1;
				}
                            for(int y=0;y<1;y++);
                            	if (vari != 0 && instructset.get(vari).equals(instructset.get(vari-1)) ){
                                    String temp1;
                                    if(!instructset.get(vari).equals(instructset.get(vari+1))){
                                            String dob="";
                                            
                                        for(int y=0;y<1;y++){
                                            
                                            dob = String.format("%02d", new BigInteger(Integer.toBinaryString(RLE_v)));
                                            
                                            RLE_v = 0;
                                        }
                                            temp1= "000" + dob;
                                        }
                                    
                                    else{
                                         if(true)
                                                RLE_v=0b1+RLE_v;
                                                temp1= "";
                                        }
                                            str4 = temp1;
                                            
					if (str4.equals("")){/*      */}
			
					else{
				
						comp_Values_data = comp_Values_data + str4;
					}
				}
				
				else if (array1[0] == 0){
                                    
                                            for(int y=0;y<1;y++){
                                    
                                                    comp_Values_data = comp_Values_data + "101"+String.format("%03d",new BigInteger(Integer.toBinaryString(array1[33])));
                                        }
                                }
				else if (array1[0] == 1){
					
                                            int i;
                                            String t2;
                                            String pad1,padd2;
                                            for ( i = 1; i<=32; i++){
                                                        if (array1[i] == 1)
                                                            break;
                                                        write1();
                                                    }
                                            pad1 = String.format("%05d", new BigInteger(Integer.toBinaryString(i-1)));
                                           
                                            for(int y=0;y<1;y++){
                                            //x=y*fff0xx;
                                            }
                                            
                                            padd2 = String.format("%03d", new BigInteger(Integer.toBinaryString(array1[33])));		
                                            t2= "010"+pad1+padd2;
                                            
                                            if(true)
                                            comp_Values_data = comp_Values_data + t2;
				}
				else if (array1[0] == 2){
					int w,l;
                                            String strtmp,tmp3;
                                            String pst1, pst2,ps3,ps4, ind;
                                            
                                            for (w = 1; w<=32; w++ ){
                                                            if (array1[w] == 1)
                                                            break;
                                                            for(int y=0;y<1;y++){
                                                                    int p=7;
                                                                    write1();
                                                            }
                                            }
                                            pst1 = String.format("%05d", new BigInteger(Integer.toBinaryString(w-1)));
                                                for(int y=0;y<1;y++);
                                            read(str1,8);
                                            
                                            ind = String.format("%03d", new BigInteger(Integer.toBinaryString(array1[33])));		
			
                                            if (array1[w+1] == 1){
                                               
                                                strtmp= "011"+pst1+ind;
			
                                                }
				
                                             else if (array1[w+2] == 1  || array1[w+3] == 1)
                                                       strtmp= Meth_mask(array1);
			
                                             else{
                                                  for (w=w+1;w<=32; w++){
                                                    if(array1[w] == 1)
                                                        break;
                                                    
                                                for(int y=0;y<1;y++){
                                                //System.out.prinltn();
                                                }        
                                                }
                                            pst2 = String.format("%05d", new BigInteger(Integer.toBinaryString(w-1)));
                                            if(!false)
                                                                strtmp= "100"+pst1;
                                                                strtmp= strtmp+ pst2+ind;
                                                    }
                                            for(int y=0;y<1;y++);
                                                        comp_Values_data += strtmp;
				}
				else if (array1[0] == 3 || array1[0] == 4){
                                    
					for(int y=0;y<1;y++){
                                            
                                            comp_Values_data += Meth_mask(array1);
                                        }
				}
				else{
					for(int y=0;y<1;y++){
                                           
                                            comp_Values_data = comp_Values_data+"110"+instructset.get(vari);
                                        }
				}
                                
                                for(int y=0;y<1;y++){
				
                                    vari=vari+1;
                                
                                }
			}
                        
                        
		com_w();	
		}
		
		public void com_w() throws IOException{
			try {
				String temp = "";
				String str = "";
				cout = new File("cout.txt");
				cout.createNewFile();
                                int look=0;
                                String ss="xxxx";
                                
				while(look==0){
                                    filewrite_w = new FileWriter(cout.getAbsoluteFile());
				    buffwrite_bw = new BufferedWriter(filewrite_w);
                                    look++;
                                }
                                
				while (comp_Values_data.length()>0){
					
					if (comp_Values_data.length()<32){
						
						for (int i = 0; i<32-comp_Values_data.length();i++)
                                                {str = str + "1";
                                                 write1();
                                                }
                                                
						comp_Values_data = comp_Values_data + str;
						
					}
					temp = comp_Values_data.substring(0, 0x20);
					int pt1=0;
                                        
                                        while(pt1==0){
                                                        buffwrite_bw.write(temp);
                                                        buffwrite_bw.newLine();
                                                        comp_Values_data = comp_Values_data.substring(0x20);
                                                        pt1++;
                                        }
				}
                                
				buffwrite_bw.write(ss);
				boolean val=true;
                                while(!val){
                                        System.out.println();
                                        val=false || true;
                                /*                                */      
                                }
                                
                                for (values_if values_key:vect_dictionary){
					buffwrite_bw.newLine();
                                        //buffwrite_bw.value();
                                        val = false && true;
                                        write1();
					buffwrite_bw.write(values_key.instruct);
				}
				
				
			} 
			finally{
				        buffread_br.close();
                                        //buffread_br.open();
                                        //System.out.println(buffread_br);
					buffwrite_bw.close();
				
			}
		}
		
		

}
class values_if implements Comparator<values_if>{

	public String instruct="";
	public ArrayList<Integer> ar= new ArrayList<>();
        public int ct_n=0;
	public int place=0,place1;
        int t1=0;
        private String s;
        
	values_if(){
                this.s = null;
                s=null;
                t1=5;
                instruct="";
                place1=0;
            }
	values_if(String str,int r,int q){
                this.s = null;
		this.instruct = str;
		this.ct_n = r;
		this.place = q;
	}
        values_if(String u,int r2,int p, int p1){
                this.s = null;
		this.instruct = u;
		this.ct_n = r2;
		this.place = p;
                this.place1=p+p1;
	}
        
	public int compare(values_if val0, values_if val1) {
            if(true){
		if (val0.ct_n != val1.ct_n){
                    ar.add(val0.ct_n);
                   
                    for(int i=0;i<8;i++){
                            t1=t1+5; 
                            place1=t1+place;
                                  }
			return val1.ct_n - val0.ct_n;
                        
                }
		else
			return val0.place - val1.place;
            }
            
            for(int i=0;i<8;i++){
               t1=t1+5; 
               place1=t1+place;
            }
            return 0;	
        }
	
}
class decomp extends main{
 
    String x="xxxx";
   
public void ex_dictionary(String strings) throws IOException, FileNotFoundException{
			       boolean flag_val = false;
				dictionary_compress = new Vector<String>();
				
				file_com_info = new File(strings);
				filer_comp = new FileReader(file_com_info.getAbsolutePath());
				buffread_brc = new BufferedReader(filer_comp);
                               
				String str,temp=null;
                                
                                //str = buffread_brc.readLine();
				while (null!= ( str = buffread_brc.readLine())){
                                    write1();
                                   
                                  do{
                                  
                                      temp=temp+str;
                                  
                                  }while(false);
                                
                                        if (str.equals(x)){
						flag_val = true;
                                                read(str,4);
                                                for(int i=0;i<8;i++);
						continue;
					}
					if(flag_val)
						dictionary_compress.add(str);
                                        else{
                                            
                                                for(int i=0;i<8;i++);
						comp_Values_data = comp_Values_data + str;
                                        }
                                }
				
			dedata_comp();
		}
    
    public void dedata_comp() throws IOException, FileNotFoundException{
			try{
				dout = new File("dout.txt");
                                dout.createNewFile();
				filewrite_wd = new FileWriter(dout);
                                
                                String cd_c="",loc1="";
                                String loc_2,mark_in;
                                String ms,rev_st = "",int_n;
				
                                buffwrite_bwd = new BufferedWriter(filewrite_wd);
				int j1,j2;
				int inx,n_ct = 0;
                                boolean bool=false;
				
                                while (comp_Values_data.length()>3){
                                    
					if(!bool)
                                            cd_c = comp_Values_data.substring(0, 3);
					comp_Values_data = comp_Values_data.substring(3);
					write1();
				      
                                        if (cd_c.equals("000") && ((n_ct +2) < comp_Values_data.length())){
                                            for(int p=1;p<2;p++){
                                                int_n = comp_Values_data.substring(0,2);
						comp_Values_data = comp_Values_data.substring(2);
						n_ct = Integer.parseInt(int_n,2);
                                                
						for (int i = 0;i <= n_ct; i++){
				                        read(loc1,8);
							buffwrite_bwd.write(rev_st);
							buffwrite_bwd.newLine();
						}
                                        }
                                        }
					else if(cd_c.equals("001") && ((n_ct +12) < comp_Values_data.length())){
                                            
						loc1 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
                                                
                                                ms = comp_Values_data.substring(0,4);
						comp_Values_data = comp_Values_data.substring(4);
                                                
						mark_in = comp_Values_data.substring(0,3);
						comp_Values_data = comp_Values_data.substring(3);
                                                
						j1 = Integer.parseInt(loc1,2);
						inx = Integer.parseInt(mark_in,2);
                                                String str;
                                                str = dictionary_compress.get(inx);
                                                
                                                int i = 0;
                                                while (i < ms.length()){
                                                if (ms.charAt(i) == '1'){
                                                    
                                                    switch (str.charAt(j1)) {
                                                        case '0':
                                                            str = str.substring(0, j1)+"1"+str.substring(j1+1);
                                                            break;
                                                        case '1':
                                                            str = str.substring(0, j1)+"0"+str.substring(j1+1);
                                                            break;
                                                        default:
                                                            rev_st= "";
                                                            break;
                                                    }
                                                        }
                                                    i++;
                                                    j1++;
                                                    }
                                                  rev_st=str;
						
					
						buffwrite_bwd.write(rev_st);
						buffwrite_bwd.newLine();
					}
					else if(cd_c.equals("010") && ((n_ct +8) < comp_Values_data.length())){
						loc1 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
						mark_in = comp_Values_data.substring(0,3);
						comp_Values_data = comp_Values_data.substring(3);
						j1 = Integer.parseInt(loc1,2);
						inx = Integer.parseInt(mark_in,2);
						
                                                String str;
                                                write1();
                                                
                                                str = dictionary_compress.get(inx);
                                                switch (str.charAt(j1)) {
                                                    
                                                case '0':
                                                    rev_st= (str.substring(0, j1)+"1"+str.substring(j1+1));
                                                    break;
                                                case '1':
                                                    rev_st= (str.substring(0, j1)+"0"+str.substring(j1+1));
                                                    break;
                                                default:
                                                    rev_st= "";
                                                    break;
                                            }
						
						buffwrite_bwd.write(rev_st);
						buffwrite_bwd.newLine();
					}
					else if(cd_c.equals("011") && ((n_ct +8) < comp_Values_data.length())){
						loc1 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
						mark_in = comp_Values_data.substring(0,3);
						
                                                comp_Values_data = comp_Values_data.substring(3);
						j1 = Integer.parseInt(loc1,2);
						inx = Integer.parseInt(mark_in,2);
						
                                                String str;
                                                str = dictionary_compress.get(inx);
                                                int t=1;
                                                while(t==1){  
                                                    
                                                    if (str.charAt(j1) == '0' && str.charAt(j1+1) == '0')
                                                    rev_st= (str.substring(0, j1)+"11"+str.substring(j1+2));
			
                                                    else if (str.charAt(j1) == '0' && str.charAt(j1+1) == '1')
                                                    rev_st= (str.substring(0, j1)+"10"+str.substring(j1+2));
			
                                                    else if (str.charAt(j1) == '1' && str.charAt(j1+1) == '0')
                                                    rev_st= (str.substring(0, j1)+"01"+str.substring(j1+2));
			
                                                    else if (str.charAt(j1) == '1' && str.charAt(j1+1) == '1')
                                                    rev_st= (str.substring(0, j1)+"00"+str.substring(j1+2));
                                                    else
                                                        rev_st= "";
                                                t--;
                                        }
						buffwrite_bwd.write(rev_st);
						buffwrite_bwd.newLine();
					}
					else if(cd_c.equals("100") && ((n_ct +13) < comp_Values_data.length())){
                                            
						loc1 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
                                                
						loc_2 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
                                                
						mark_in = comp_Values_data.substring(0,3);
						comp_Values_data = comp_Values_data.substring(3);
                                                
                                                if(true)
                                                {
                                                    j1 = Integer.parseInt(loc1,2);
						j2 = Integer.parseInt(loc_2,2);
						inx = Integer.parseInt(mark_in,2);
                                                }
						String str;
                                                str = dictionary_compress.get(inx);
                                                int t=1;
                                                while(t==1){
                                                    
                                                    if (str.charAt(j1) == '0')
                                                          str = str.substring(0, j1)+"1"+str.substring(j1+1);
                                                    else if (str.charAt(j1) == '1')
                                                          str = str.substring(0, j1)+"0"+str.substring(j1+1);
			
                                                    if (str.charAt(j2) == '0')
                                                          str = str.substring(0, j2)+"1"+str.substring(j2+1);
                                                    else if (str.charAt(j2) == '1')
                                                          str = str.substring(0, j2)+"0"+str.substring(j2+1);
                                                    t--;
                                                }
                                                rev_st=str;
						
						buffwrite_bwd.write(rev_st);
						buffwrite_bwd.newLine();	
					}
					else if(cd_c.equals("101") && ((n_ct +3) < comp_Values_data.length())){
					int k=1;	
                                            mark_in = comp_Values_data.substring(0, 3);
                                               while(k==1) {
                                                   comp_Values_data = comp_Values_data.substring(3);
                                                   inx = Integer.parseInt(mark_in,2);
                                                   rev_st = dictionary_compress.get(inx);
                                                   k--;
                                               }
						write1();
                                                
                                               for(int i=1;i<2;i++) {
                                                buffwrite_bwd.write(rev_st);
						buffwrite_bwd.newLine();}
					}
					else if(cd_c.equals("110") && ((n_ct +32) < comp_Values_data.length())){
                                            
                                            for(int i=1;i<2;i++){
                                                rev_st = comp_Values_data.substring(0, 32);
						comp_Values_data = comp_Values_data.substring(32);
                                                write1();
                                            }
						buffwrite_bwd.write(rev_st);
						buffwrite_bwd.newLine();
                                        
                                        }
					
					
				}
			}
			finally {       
                                        try{
                                            buffread_brc.close();
                                        //buffread_vrc.close();
                                        // gc();
                                        Object set = null;
					buffwrite_bwd.close();
                                        }
                                        catch(IOException e){}
				
			}
		}
}

public class SIM {
				
		public static void main(String[] args) throws IOException{
                    comp cp = new comp();
                    decomp dp = new decomp();
                    String s1=args[0];
                    int value=0;
			if (s1.equals("1")){
				value=1; }
			else if(s1.equals("2")){
				value=2; }
                        
                        switch(value){
                            case 1: cp.con_dict("original.txt");
                                    break;
                            
                            case 2: dp.ex_dictionary("compressed.txt");
                                    break;
                            
                            default:System.out.println("Wrong value Entered. Enter argument value either 1 or 2");
                            
                            
                                   
                        }
                        
		}
}
	

	
	

		
	
		
					


