package ek.jainput.proc;

public interface KeyProcessor
{
    public static interface Callback
    {
        public void onText(String str);
    }

    public void processKey(char ch);
}
