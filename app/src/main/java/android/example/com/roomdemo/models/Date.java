
package android.example.com.roomdemo.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "epoch",
    "pretty",
    "day",
    "month",
    "year",
    "yday",
    "hour",
    "min",
    "sec",
    "isdst",
    "monthname",
    "monthname_short",
    "weekday_short",
    "weekday",
    "ampm",
    "tz_short",
    "tz_long"
})
public class Date {

    @JsonProperty("epoch")
    private String epoch;
    @JsonProperty("pretty")
    private String pretty;
    @JsonProperty("day")
    private Integer day;
    @JsonProperty("month")
    private Integer month;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("yday")
    private Integer yday;
    @JsonProperty("hour")
    private Integer hour;
    @JsonProperty("min")
    private String min;
    @JsonProperty("sec")
    private Integer sec;
    @JsonProperty("isdst")
    private String isdst;
    @JsonProperty("monthname")
    private String monthname;
    @JsonProperty("monthname_short")
    private String monthnameShort;
    @JsonProperty("weekday_short")
    private String weekdayShort;
    @JsonProperty("weekday")
    private String weekday;
    @JsonProperty("ampm")
    private String ampm;
    @JsonProperty("tz_short")
    private String tzShort;
    @JsonProperty("tz_long")
    private String tzLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("epoch")
    public String getEpoch() {
        return epoch;
    }

    @JsonProperty("epoch")
    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    @JsonProperty("pretty")
    public String getPretty() {
        return pretty;
    }

    @JsonProperty("pretty")
    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    @JsonProperty("month")
    public Integer getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(Integer month) {
        this.month = month;
    }

    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    @JsonProperty("yday")
    public Integer getYday() {
        return yday;
    }

    @JsonProperty("yday")
    public void setYday(Integer yday) {
        this.yday = yday;
    }

    @JsonProperty("hour")
    public Integer getHour() {
        return hour;
    }

    @JsonProperty("hour")
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    @JsonProperty("sec")
    public Integer getSec() {
        return sec;
    }

    @JsonProperty("sec")
    public void setSec(Integer sec) {
        this.sec = sec;
    }

    @JsonProperty("isdst")
    public String getIsdst() {
        return isdst;
    }

    @JsonProperty("isdst")
    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    @JsonProperty("monthname")
    public String getMonthname() {
        return monthname;
    }

    @JsonProperty("monthname")
    public void setMonthname(String monthname) {
        this.monthname = monthname;
    }

    @JsonProperty("monthname_short")
    public String getMonthnameShort() {
        return monthnameShort;
    }

    @JsonProperty("monthname_short")
    public void setMonthnameShort(String monthnameShort) {
        this.monthnameShort = monthnameShort;
    }

    @JsonProperty("weekday_short")
    public String getWeekdayShort() {
        return weekdayShort;
    }

    @JsonProperty("weekday_short")
    public void setWeekdayShort(String weekdayShort) {
        this.weekdayShort = weekdayShort;
    }

    @JsonProperty("weekday")
    public String getWeekday() {
        return weekday;
    }

    @JsonProperty("weekday")
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    @JsonProperty("ampm")
    public String getAmpm() {
        return ampm;
    }

    @JsonProperty("ampm")
    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    @JsonProperty("tz_short")
    public String getTzShort() {
        return tzShort;
    }

    @JsonProperty("tz_short")
    public void setTzShort(String tzShort) {
        this.tzShort = tzShort;
    }

    @JsonProperty("tz_long")
    public String getTzLong() {
        return tzLong;
    }

    @JsonProperty("tz_long")
    public void setTzLong(String tzLong) {
        this.tzLong = tzLong;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
