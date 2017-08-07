
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
    "date",
    "period",
    "high",
    "low",
    "conditions",
    "icon",
    "icon_url",
    "skyicon",
    "pop",
    "qpf_allday",
    "qpf_day",
    "qpf_night",
    "snow_allday",
    "snow_day",
    "snow_night",
    "maxwind",
    "avewind",
    "avehumidity",
    "maxhumidity",
    "minhumidity"
})
public class Forecastday_ {

    @JsonProperty("date")
    private Date date;
    @JsonProperty("period")
    private Integer period;
    @JsonProperty("high")
    private High high;
    @JsonProperty("low")
    private Low low;
    @JsonProperty("conditions")
    private String conditions;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("skyicon")
    private String skyicon;
    @JsonProperty("pop")
    private Integer pop;
    @JsonProperty("qpf_allday")
    private QpfAllday qpfAllday;
    @JsonProperty("qpf_day")
    private QpfDay qpfDay;
    @JsonProperty("qpf_night")
    private QpfNight qpfNight;
    @JsonProperty("snow_allday")
    private SnowAllday snowAllday;
    @JsonProperty("snow_day")
    private SnowDay snowDay;
    @JsonProperty("snow_night")
    private SnowNight snowNight;
    @JsonProperty("maxwind")
    private Maxwind maxwind;
    @JsonProperty("avewind")
    private Avewind avewind;
    @JsonProperty("avehumidity")
    private Integer avehumidity;
    @JsonProperty("maxhumidity")
    private Integer maxhumidity;
    @JsonProperty("minhumidity")
    private Integer minhumidity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    @JsonProperty("period")
    public Integer getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    @JsonProperty("high")
    public High getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(High high) {
        this.high = high;
    }

    @JsonProperty("low")
    public Low getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(Low low) {
        this.low = low;
    }

    @JsonProperty("conditions")
    public String getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("icon_url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @JsonProperty("skyicon")
    public String getSkyicon() {
        return skyicon;
    }

    @JsonProperty("skyicon")
    public void setSkyicon(String skyicon) {
        this.skyicon = skyicon;
    }

    @JsonProperty("pop")
    public Integer getPop() {
        return pop;
    }

    @JsonProperty("pop")
    public void setPop(Integer pop) {
        this.pop = pop;
    }

    @JsonProperty("qpf_allday")
    public QpfAllday getQpfAllday() {
        return qpfAllday;
    }

    @JsonProperty("qpf_allday")
    public void setQpfAllday(QpfAllday qpfAllday) {
        this.qpfAllday = qpfAllday;
    }

    @JsonProperty("qpf_day")
    public QpfDay getQpfDay() {
        return qpfDay;
    }

    @JsonProperty("qpf_day")
    public void setQpfDay(QpfDay qpfDay) {
        this.qpfDay = qpfDay;
    }

    @JsonProperty("qpf_night")
    public QpfNight getQpfNight() {
        return qpfNight;
    }

    @JsonProperty("qpf_night")
    public void setQpfNight(QpfNight qpfNight) {
        this.qpfNight = qpfNight;
    }

    @JsonProperty("snow_allday")
    public SnowAllday getSnowAllday() {
        return snowAllday;
    }

    @JsonProperty("snow_allday")
    public void setSnowAllday(SnowAllday snowAllday) {
        this.snowAllday = snowAllday;
    }

    @JsonProperty("snow_day")
    public SnowDay getSnowDay() {
        return snowDay;
    }

    @JsonProperty("snow_day")
    public void setSnowDay(SnowDay snowDay) {
        this.snowDay = snowDay;
    }

    @JsonProperty("snow_night")
    public SnowNight getSnowNight() {
        return snowNight;
    }

    @JsonProperty("snow_night")
    public void setSnowNight(SnowNight snowNight) {
        this.snowNight = snowNight;
    }

    @JsonProperty("maxwind")
    public Maxwind getMaxwind() {
        return maxwind;
    }

    @JsonProperty("maxwind")
    public void setMaxwind(Maxwind maxwind) {
        this.maxwind = maxwind;
    }

    @JsonProperty("avewind")
    public Avewind getAvewind() {
        return avewind;
    }

    @JsonProperty("avewind")
    public void setAvewind(Avewind avewind) {
        this.avewind = avewind;
    }

    @JsonProperty("avehumidity")
    public Integer getAvehumidity() {
        return avehumidity;
    }

    @JsonProperty("avehumidity")
    public void setAvehumidity(Integer avehumidity) {
        this.avehumidity = avehumidity;
    }

    @JsonProperty("maxhumidity")
    public Integer getMaxhumidity() {
        return maxhumidity;
    }

    @JsonProperty("maxhumidity")
    public void setMaxhumidity(Integer maxhumidity) {
        this.maxhumidity = maxhumidity;
    }

    @JsonProperty("minhumidity")
    public Integer getMinhumidity() {
        return minhumidity;
    }

    @JsonProperty("minhumidity")
    public void setMinhumidity(Integer minhumidity) {
        this.minhumidity = minhumidity;
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
