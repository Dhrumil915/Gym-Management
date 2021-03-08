/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.bca;

import java.sql.Date;

/**
 *
 * @author KRATOS
 */
class User {
        public int receipt_number;
        public String first_name,middle_name,last_name;
        public String gender,contact_number;
        public Date date_1,date_2;
        public int age;
        public float weight,hight;
      //  public String amount,payment_type;
        
        
        public User(int receipt_number,String first_name,String middle_name,String last_name,String gender,String contact_number,Date date_1,Date date_2,int age,float weight,float hight) 
{
          this.receipt_number=receipt_number;
          this.first_name=first_name;
          this.middle_name=middle_name;
          this.last_name=last_name;
          this.gender=gender;
          this.contact_number=contact_number;
          this.date_1=date_1;
          this.date_2=date_2;
          this.age=age;
          this.weight=weight;
          this.hight=hight;
          //this.amount=amount;
         // this.payment_type=payment_type;
 
        
        }

    
        public int getreceipt_number(){
            return receipt_number;
        }
        public String getfirst_name(){
            return first_name;
        }
        public String getmiddle_name(){
                    return middle_name;
                }
        public String getlast_name(){
            return last_name;
        }
        public String getgender(){
            return gender;
                   }
        public String getcontact_number(){
           return contact_number;
        }
          public Date getdate_1(){
              return date_1;
          }
          public Date getdate_2(){
              return date_2;
          }
           public int getage(){
               return age;
           }
        public float getweight(){
            return weight;
        }
        public float gethight(){
            return hight;
        }
       // public String getamount(){
           // return amount;
        //}
       //public String getpayment_type(){
           // return payment_type;
        }

