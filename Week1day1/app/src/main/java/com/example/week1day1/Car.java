package com.example.week1day1;

import android.os.Parcel;
import android.os.Parcelable;

public class Car implements Parcelable {
    private String Year; private String Make; private String Model; private String Color; private String EngineSize; private String TransmissionType;
    public Car(String Year, String Make, String Model, String Color, String EngineSize, String TransmissionType){
        this.Year = Year;
        this.Make = Make;
        this.Model = Model;
        this.Color=Color;
        this.EngineSize=EngineSize;
        this.TransmissionType=TransmissionType;
    }

    @Override
    public String toString() {
        return "Year: "+this.Year+"\nMake: "+this.Make+"\nModel: "+this.Model+"\nColor: "+this.Color+"\nEngineSize: "+this.EngineSize+"\nTransmissionType: "+this.TransmissionType;
    }

    public int describeContents(){
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {this.Year,
                this.Make,
                this.Model,
                this.Color,
                this.EngineSize,
                this.TransmissionType,
        });
    }
    public Car(Parcel in){
        String[] data = new String[6];

        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.Year = data[0];
        this.Make = data[1];
        this.Model = data[2];
        this.Color = data[3];
        this.EngineSize = data[4];
        this.TransmissionType = data[5];
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

}
