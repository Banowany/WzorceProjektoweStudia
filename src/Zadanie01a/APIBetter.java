package Zadanie01a;

public class APIBetter
{
    Client client;

    public APIBetter(Client client)
    {
        this.client = client;
    }

    void buyInstrument(Instrument instrument)
    {
        client.buyInstrument(instrument);
    }

    void sellInstrument(Instrument instrument)
    {
        client.sellInstrument(instrument);
    }
}
