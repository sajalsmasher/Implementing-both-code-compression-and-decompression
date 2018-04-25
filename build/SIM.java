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
	values_if(String i,int c,int p){
                this.s = null;
		this.instruct = i;
		this.ct_n = c;
		this.place = p;
	}
        values_if(String i,int c,int p, int p1){
                this.s = null;
		this.instruct = i;
		this.ct_n = c;
		this.place = p;
                this.place1=p+p1;
	}
        
	public int compare(values_if arg0, values_if arg1) {
            if(true){
		if (arg0.ct_n != arg1.ct_n){
                    ar.add(arg0.ct_n);
                    for(int i=0;i<8;i++){
                    t1=t1+5; 
                    place1=t1+place;
                                        }
			return arg1.ct_n - arg0.ct_n;
                        
                }
		else
			return arg0.place - arg1.place;
            }
            for(int i=0;i<8;i++){
               t1=t1+5; 
               place1=t1+place;
            }
            return 0;	
        }
	
}
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
		public File cout,originalfile,file_com_info,dout;
		int Ins = 0;
		values_if values_key;
		int RLE_v = 0;
		public Iterator<String> keySetIterator;
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
                        String str;
                        String mask,mask1,mask2;
                        String pd_1,pd_2;
			int i;
			for (i = 1; i<=32; i++ ){
				if (array[i] == 1)
					break;
			}
			
			mask1=String.valueOf(array[i]) + String.valueOf(array[i+1]); 
                        mask2=String.valueOf(array[i+2]) + String.valueOf(array[i+3]);
			mask = mask1+mask2;
                        
                        pd_1 = String.format("%03d", new BigInteger(Integer.toBinaryString(array[33])));
			pd_2 = String.format("%05d", new BigInteger(Integer.toBinaryString(i-1)));

			 str ="001"+pd_2+mask + pd_1;
                         
                         return str;
		}
			
		public int[] string_d(String s1, String s2){
			int[] array = new int[34];
                        boolean b=false;
                        int[] array1 = new int[34];
			array[0] = 0;
                        array[1]=array[0];
			int i = 0,j=0;
                        
                        if(!b){
			while (i < s1.length()){
				if (s1.charAt(i) == s2.charAt(i)){
					array[i+1] = 0;
				}
				else{
                                    
                                    if(!b){
					array[0] = array[0] + 1;
					array[i+1] = 1;}
                                    else
                                       b=true;
				}
				i++;
			}
                        }
			return array;
		}
                public void dif_strings(String s1, String s2){
			int[] array = new int[34];
                        boolean b=false;
                        int[] array1 = new int[34];
			array[0] = 0;
                        array[1]=array[0];
			int i = 0,j=0;
                        
                        if(b){
			while (i > s1.length()){
				if (s1.charAt(i) != s2.charAt(i)){
					array[i+1] = 0+i;
				}
				else{
                                    
                                    if(!b){
					array[0] = array[0] + 1;
					array[i+1] = 1;}
                                    else
                                       b=true;
				}
				i++;
			}
                        }
			
		}
}
class comp extends main{		
		public void con_dict(String ori) throws IOException, FileNotFoundException{
			
				originalfile = new File(ori);
				fileread_orig = new FileReader(originalfile.getAbsolutePath());
				buffread_br = new BufferedReader(fileread_orig);
				instructset = new Vector<String>();
				int i = 0;
				String key;
				int ct_n = 0;
				vector_sort = new Vector<values_if>();
				
				map_decompressor = new LinkedHashMap<String,values_if>() ;
											
				while ((key = buffread_br.readLine()) != null){
					instructset.add(key);
					Ins++;
				if (!map_decompressor.containsKey(key))
					map_decompressor.put(key, new values_if(key,1,Ins));
				else{
					values_key = (values_if)map_decompressor.get(key);
					ct_n = values_key.ct_n + 1;
					i = values_key.place;
					map_decompressor.put(key, new values_if(key,ct_n,i));
					}
				}
                                
				keySetIterator = map_decompressor.keySet().iterator();
				while(keySetIterator.hasNext())
				{ 
					String ikey = keySetIterator.next();
					values_key = (values_if)map_decompressor.get(ikey);
					vector_sort.add(values_key);
			 
				}
				vector_sort.sort(new values_if());
				vect_dictionary = new Vector<values_if>(vector_sort.subList(0, 8));
                                
                                
		data_comp();	
		}
		

		public void data_comp()
		{
			String temp;
			int j=0;
			int values_key;
			while(j<instructset.size() )
			{
				
				values_key=1;
				int[] a1 = new int[34];
				int[] a2 = new int[34];
				a1 = string_d(instructset.get(j) , vect_dictionary.get(0).instruct);
				a1[33] = 0;
				
				while((values_key)<vect_dictionary.size())
				{
					a2 = string_d(instructset.get(j) , vect_dictionary.get(values_key).instruct);
					a2[33]=values_key;
					
					if(a1[0]>a2[0]){
						a1 = string_d(instructset.get(j) , vect_dictionary.get(values_key).instruct);
						a1[33]=values_key;
					}
					values_key++;
				}

				if (j != 0 && instructset.get(j).equals(instructset.get(j-1)) ){
                                    String t1;
			if(!instructset.get(j).equals(instructset.get(j+1))){
				String padded = String.format("%02d", new BigInteger(Integer.toBinaryString(RLE_v)));
				RLE_v = 0;
				t1= "000" + padded;
			}
			else{
				RLE_v ++;
				t1= "";
			}
					temp = t1;
					if (temp.equals("")){}
			
					else{
				
						comp_Values_data = comp_Values_data + temp;
					}
				}
					
				else if (a1[0] == 0){
				
					comp_Values_data = comp_Values_data + "101"+String.format("%03d",new BigInteger(Integer.toBinaryString(a1[33])));
				}
				else if (a1[0] == 1){
					
                                            int i;
                                            String temp2;
                                            String pospadd,indexpadd;
                                            for ( i = 1; i<=32; i++){
                                                        if (a1[i] == 1)
                                                            break;
                                                    }
                                            pospadd = String.format("%05d", new BigInteger(Integer.toBinaryString(i-1)));
                                            indexpadd = String.format("%03d", new BigInteger(Integer.toBinaryString(a1[33])));		
                                            temp2= "010"+pospadd+indexpadd;
		
					comp_Values_data = comp_Values_data + temp2;
				}
				else if (a1[0] == 2){
					int i;
                                            String temp3;
                                            String pospadd1, pospadd2, indexpadd;
                                            for (i = 1; i<=32; i++ ){
                                                            if (a1[i] == 1)
                                                            break;
                                            }
                                            pospadd1 = String.format("%05d", new BigInteger(Integer.toBinaryString(i-1)));
                                            indexpadd = String.format("%03d", new BigInteger(Integer.toBinaryString(a1[33])));		
			
                                            if (a1[i+1] == 1){
                                                temp3= "011"+pospadd1+indexpadd;
			
                                                }
				
                                             else if (a1[i+2] == 1  || a1[i+3] == 1)
                                                       temp3= Meth_mask(a1);
			
                                             else{
                                                for (i=i+1;i<=32; i++){
                                                    if(a1[i] == 1)
                                                        break;
                                                        }
                                            pospadd2 = String.format("%05d", new BigInteger(Integer.toBinaryString(i-1)));
                                            temp3= "100"+pospadd1+pospadd2+indexpadd;
                                                    }
					comp_Values_data = comp_Values_data + temp3;
				}
				else if (a1[0] == 3 || a1[0] == 4){
					
					comp_Values_data = comp_Values_data + Meth_mask(a1);
				}
				else{
					
					comp_Values_data = comp_Values_data+"110"+instructset.get(j);
				}
				j++;
			}
		com_w();	
		}
		
		public void com_w(){
			try {
				String temp = "";
				String s = "";
				cout = new File("cout.txt");
				if (!cout.exists())
					cout.createNewFile();
				filewrite_w = new FileWriter(cout.getAbsoluteFile());
				buffwrite_bw = new BufferedWriter(filewrite_w);
				
				System.out.println();
				while (comp_Values_data.length()>0){
					
					if (comp_Values_data.length()<32){
						
						for (int i = 0; i<32-comp_Values_data.length();i++)
							s = s + "1";
						
						comp_Values_data = comp_Values_data + s;
						
					}
					temp = comp_Values_data.substring(0, 32);
					
					buffwrite_bw.write(temp);
					buffwrite_bw.newLine();
					comp_Values_data = comp_Values_data.substring(32);
				}
				buffwrite_bw.write("xxxx");
				for (values_if values_key:vect_dictionary){
					buffwrite_bw.newLine();
					buffwrite_bw.write(values_key.instruct);
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally{
				try {
					buffread_br.close();
					buffwrite_bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		

}

class decomp extends main{

    public void ex_dictionary(String com) throws IOException, FileNotFoundException{
			
				dictionary_compress = new Vector<String>();
				boolean flag = false;
				file_com_info = new File(com);
				filer_comp = new FileReader(file_com_info.getAbsolutePath());
				buffread_brc = new BufferedReader(filer_comp);
				String s;
				while ((s = buffread_brc.readLine()) != null){
					if (s.equals("xxxx")){
						flag = true;
						continue;
					}
					if(flag)
						dictionary_compress.add(s);
					else
						comp_Values_data = comp_Values_data + s;
				}
				
			dedata_comp();
		}
    public void dedata_comp() throws IOException, FileNotFoundException{
			try{
				dout = new File("dout.txt");
				if (!dout.exists())
					dout.createNewFile();
				filewrite_wd = new FileWriter(dout);
				buffwrite_bwd = new BufferedWriter(filewrite_wd);
				
						
				String code,pos1,pos2,index,mask,R_string = "",num;
				int ind,p1,p2,ct_n = 0;
				while (comp_Values_data.length()>3){
					code = comp_Values_data.substring(0, 3);
					comp_Values_data = comp_Values_data.substring(3);
					
					if (code.equals("000") && ((ct_n +2) < comp_Values_data.length())){
						num = comp_Values_data.substring(0,2);
						comp_Values_data = comp_Values_data.substring(2);
						ct_n = Integer.parseInt(num,2);
						for (int i = 0;i <= ct_n; i++){
				
							buffwrite_bwd.write(R_string);
							buffwrite_bwd.newLine();
						}
					}
					else if(code.equals("001") && ((ct_n +12) < comp_Values_data.length())){
						pos1 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
						mask = comp_Values_data.substring(0,4);
						comp_Values_data = comp_Values_data.substring(4);
						index = comp_Values_data.substring(0,3);
						comp_Values_data = comp_Values_data.substring(3);
						p1 = Integer.parseInt(pos1,2);
						ind = Integer.parseInt(index,2);
                                                String s;
                                                s = dictionary_compress.get(ind);
                                                int i = 0;
                                                while (i < mask.length()){
                                                if (mask.charAt(i) == '1'){
                                                if (s.charAt(p1) == '0')
                                                            s = s.substring(0, p1)+"1"+s.substring(p1+1);
                                                else if (s.charAt(p1) == '1')
                                                            s = s.substring(0, p1)+"0"+s.substring(p1+1);
                                                else
                                                        R_string= "";
                                                        }
                                                    i++;
                                                    p1++;
                                                    }
                                                  R_string=s;
						
					
						buffwrite_bwd.write(R_string);
						buffwrite_bwd.newLine();
					}
					else if(code.equals("010") && ((ct_n +8) < comp_Values_data.length())){
						pos1 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
						index = comp_Values_data.substring(0,3);
						comp_Values_data = comp_Values_data.substring(3);
						p1 = Integer.parseInt(pos1,2);
						ind = Integer.parseInt(index,2);
						
                                                String s;
                                                s = dictionary_compress.get(ind);
                                                if (s.charAt(p1) == '0')
                                                            R_string= (s.substring(0, p1)+"1"+s.substring(p1+1));
                                                else if (s.charAt(p1) == '1')
                                                               R_string= (s.substring(0, p1)+"0"+s.substring(p1+1));
                                                 else
                                                            R_string= "";
						
						buffwrite_bwd.write(R_string);
						buffwrite_bwd.newLine();
					}
					else if(code.equals("011") && ((ct_n +8) < comp_Values_data.length())){
						pos1 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
						index = comp_Values_data.substring(0,3);
						comp_Values_data = comp_Values_data.substring(3);
						p1 = Integer.parseInt(pos1,2);
						ind = Integer.parseInt(index,2);
						
                                        String s;
                                        s = dictionary_compress.get(ind);
                                        if (s.charAt(p1) == '0' && s.charAt(p1+1) == '0')
                                                    R_string= (s.substring(0, p1)+"11"+s.substring(p1+2));
			
                                        else if (s.charAt(p1) == '0' && s.charAt(p1+1) == '1')
                                                    R_string= (s.substring(0, p1)+"10"+s.substring(p1+2));
			
                                        else if (s.charAt(p1) == '1' && s.charAt(p1+1) == '0')
                                                    R_string= (s.substring(0, p1)+"01"+s.substring(p1+2));
			
                                        else if (s.charAt(p1) == '1' && s.charAt(p1+1) == '1')
                                                    R_string= (s.substring(0, p1)+"00"+s.substring(p1+2));
                                        else
                                                R_string= "";
						buffwrite_bwd.write(R_string);
						buffwrite_bwd.newLine();
					}
					else if(code.equals("100") && ((ct_n +13) < comp_Values_data.length())){
						pos1 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
						pos2 = comp_Values_data.substring(0,5);
						comp_Values_data = comp_Values_data.substring(5);
						index = comp_Values_data.substring(0,3);
						comp_Values_data = comp_Values_data.substring(3);
						p1 = Integer.parseInt(pos1,2);
						p2 = Integer.parseInt(pos2,2);
						ind = Integer.parseInt(index,2);
						String s;
                                                s = dictionary_compress.get(ind);
                                                if (s.charAt(p1) == '0')
                                                          s = s.substring(0, p1)+"1"+s.substring(p1+1);
                                                else if (s.charAt(p1) == '1')
                                                          s = s.substring(0, p1)+"0"+s.substring(p1+1);
			
                                                if (s.charAt(p2) == '0')
                                                          s = s.substring(0, p2)+"1"+s.substring(p2+1);
                                                else if (s.charAt(p2) == '1')
                                                          s = s.substring(0, p2)+"0"+s.substring(p2+1);
			
                                                R_string=s;
						
						buffwrite_bwd.write(R_string);
						buffwrite_bwd.newLine();	
					}
					else if(code.equals("101") && ((ct_n +3) < comp_Values_data.length())){
						index = comp_Values_data.substring(0, 3);
						comp_Values_data = comp_Values_data.substring(3);
						ind = Integer.parseInt(index,2);
						R_string = dictionary_compress.get(ind);
						
						buffwrite_bwd.write(R_string);
						buffwrite_bwd.newLine();
					}
					else if(code.equals("110") && ((ct_n +32) < comp_Values_data.length())){
						R_string = comp_Values_data.substring(0, 32);
						comp_Values_data = comp_Values_data.substring(32);

						buffwrite_bwd.write(R_string);
						buffwrite_bwd.newLine();
					}
					
					
				}
			}
			finally { buffread_brc.close();
					buffwrite_bwd.close();
				
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
                            
                            default:System.out.println("Wrong value Entered. Enter argument value from 1 or 2");
                                   
                        }
                        
		}
}
	

	
	

		
	
		
					


