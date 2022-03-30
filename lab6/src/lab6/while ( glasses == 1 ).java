while ( glasses == 1 )
if ( glasses == 1)
{
  System.out.println("What kind of coating would you like:\n1 -> anti-glare, 2 -> brown tint :");
  type = stdIn.nextInt();
  glasses = 40;
}
  if ( glasses == 2 )
  {
    System.out.println("What kind of coating would you like:\n1 -> anti-glare, 2 -> brown tint :");
    type = stdIn.nextInt();
    glasses = 25;
  }
    else
    {
      System.out.print("What kind of glasses would you like:\n1 -> prescription, 2 -> non-prescription :");
      glasses = stdIn.nextInt();
    }

System.out.println("Your total cost is $" + glasses);