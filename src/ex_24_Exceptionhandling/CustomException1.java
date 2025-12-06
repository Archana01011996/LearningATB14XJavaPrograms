package ex_24_Exceptionhandling;

public class CustomException1 {
    public static void main(String[] args) throws CustomException {

        Bank sbi=new Bank("INR",100);
        Bank icici=new Bank("INR" ,200);
        Integer total_bal=sbi.add(icici);
        System.out.println(total_bal);

        Bank jp_chase=new Bank("USD" , 101);
        Integer toal_bal_all_countries =sbi.add(jp_chase);
        System.out.println(toal_bal_all_countries);

    }
}

class Bank{
    private String currency;
    private Integer  amount;

  public Bank(String currency,Integer amount)
    {
        this.currency=currency;
        this.amount=amount;
    }

    public String getCurrency()
    {
        return currency;
    }
    public void setCurrency(String currency)
    {
        this.currency =currency;
    }

    public Integer getAmount()
    {
        return amount;
    }
    public void setAmount(Integer amount)
    {
        this.amount=amount;
    }

    public Integer add(Bank bank) throws CustomException {
      if(bank.currency.equalsIgnoreCase("INR")) {
          return bank.amount + this.amount;
      }
      else {
          try {
              throw new CustomException("Currency ,Mistmatch, cant proceed!");
          } catch (CustomException e) {
              throw new RuntimeException(e);
          }
      }
    }
}
class CustomException extends Exception
{
    CustomException(String msg) {
        super(msg);
    }
}