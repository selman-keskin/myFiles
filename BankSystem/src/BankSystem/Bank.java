package BankSystem;

import java.lang.String;
import java.time.LocalDate;
import java.util.UUID;

public abstract class Bank {

	public String logo = "*ASLANS BANK*";
	public static String name;
	public LocalDate date;
    public static boolean end;
	public UUID temp = UUID.randomUUID();

	public abstract void Create();
}
