
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
    "image",
    "display_location",
    "observation_location",
    "estimated",
    "station_id",
    "observation_time",
    "observation_time_rfc822",
    "observation_epoch",
    "local_time_rfc822",
    "local_epoch",
    "local_tz_short",
    "local_tz_long",
    "local_tz_offset",
    "weather",
    "temperature_string",
    "temp_f",
    "temp_c",
    "relative_humidity",
    "wind_string",
    "wind_dir",
    "wind_degrees",
    "wind_mph",
    "wind_gust_mph",
    "wind_kph",
    "wind_gust_kph",
    "pressure_mb",
    "pressure_in",
    "pressure_trend",
    "dewpoint_string",
    "dewpoint_f",
    "dewpoint_c",
    "heat_index_string",
    "heat_index_f",
    "heat_index_c",
    "windchill_string",
    "windchill_f",
    "windchill_c",
    "feelslike_string",
    "feelslike_f",
    "feelslike_c",
    "visibility_mi",
    "visibility_km",
    "solarradiation",
    "UV",
    "precip_1hr_string",
    "precip_1hr_in",
    "precip_1hr_metric",
    "precip_today_string",
    "precip_today_in",
    "precip_today_metric",
    "icon",
    "icon_url",
    "forecast_url",
    "history_url",
    "ob_url",
    "nowcast"
})
public class CurrentObservation {

    @JsonProperty("image")
    private Image image;
    @JsonProperty("display_location")
    private DisplayLocation displayLocation;
    @JsonProperty("observation_location")
    private ObservationLocation observationLocation;
    @JsonProperty("estimated")
    private Estimated estimated;
    @JsonProperty("station_id")
    private String stationId;
    @JsonProperty("observation_time")
    private String observationTime;
    @JsonProperty("observation_time_rfc822")
    private String observationTimeRfc822;
    @JsonProperty("observation_epoch")
    private String observationEpoch;
    @JsonProperty("local_time_rfc822")
    private String localTimeRfc822;
    @JsonProperty("local_epoch")
    private String localEpoch;
    @JsonProperty("local_tz_short")
    private String localTzShort;
    @JsonProperty("local_tz_long")
    private String localTzLong;
    @JsonProperty("local_tz_offset")
    private String localTzOffset;
    @JsonProperty("weather")
    private String weather;
    @JsonProperty("temperature_string")
    private String temperatureString;
    @JsonProperty("temp_f")
    private Integer tempF;
    @JsonProperty("temp_c")
    private Integer tempC;
    @JsonProperty("relative_humidity")
    private String relativeHumidity;
    @JsonProperty("wind_string")
    private String windString;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("wind_degrees")
    private Integer windDegrees;
    @JsonProperty("wind_mph")
    private Integer windMph;
    @JsonProperty("wind_gust_mph")
    private String windGustMph;
    @JsonProperty("wind_kph")
    private Integer windKph;
    @JsonProperty("wind_gust_kph")
    private String windGustKph;
    @JsonProperty("pressure_mb")
    private String pressureMb;
    @JsonProperty("pressure_in")
    private String pressureIn;
    @JsonProperty("pressure_trend")
    private String pressureTrend;
    @JsonProperty("dewpoint_string")
    private String dewpointString;
    @JsonProperty("dewpoint_f")
    private Integer dewpointF;
    @JsonProperty("dewpoint_c")
    private Integer dewpointC;
    @JsonProperty("heat_index_string")
    private String heatIndexString;
    @JsonProperty("heat_index_f")
    private Integer heatIndexF;
    @JsonProperty("heat_index_c")
    private Integer heatIndexC;
    @JsonProperty("windchill_string")
    private String windchillString;
    @JsonProperty("windchill_f")
    private String windchillF;
    @JsonProperty("windchill_c")
    private String windchillC;
    @JsonProperty("feelslike_string")
    private String feelslikeString;
    @JsonProperty("feelslike_f")
    private String feelslikeF;
    @JsonProperty("feelslike_c")
    private String feelslikeC;
    @JsonProperty("visibility_mi")
    private String visibilityMi;
    @JsonProperty("visibility_km")
    private String visibilityKm;
    @JsonProperty("solarradiation")
    private String solarradiation;
    @JsonProperty("UV")
    private String uV;
    @JsonProperty("precip_1hr_string")
    private String precip1hrString;
    @JsonProperty("precip_1hr_in")
    private String precip1hrIn;
    @JsonProperty("precip_1hr_metric")
    private String precip1hrMetric;
    @JsonProperty("precip_today_string")
    private String precipTodayString;
    @JsonProperty("precip_today_in")
    private String precipTodayIn;
    @JsonProperty("precip_today_metric")
    private String precipTodayMetric;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("forecast_url")
    private String forecastUrl;
    @JsonProperty("history_url")
    private String historyUrl;
    @JsonProperty("ob_url")
    private String obUrl;
    @JsonProperty("nowcast")
    private String nowcast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("display_location")
    public DisplayLocation getDisplayLocation() {
        return displayLocation;
    }

    @JsonProperty("display_location")
    public void setDisplayLocation(DisplayLocation displayLocation) {
        this.displayLocation = displayLocation;
    }

    @JsonProperty("observation_location")
    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    @JsonProperty("observation_location")
    public void setObservationLocation(ObservationLocation observationLocation) {
        this.observationLocation = observationLocation;
    }

    @JsonProperty("estimated")
    public Estimated getEstimated() {
        return estimated;
    }

    @JsonProperty("estimated")
    public void setEstimated(Estimated estimated) {
        this.estimated = estimated;
    }

    @JsonProperty("station_id")
    public String getStationId() {
        return stationId;
    }

    @JsonProperty("station_id")
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    @JsonProperty("observation_time")
    public String getObservationTime() {
        return observationTime;
    }

    @JsonProperty("observation_time")
    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    @JsonProperty("observation_time_rfc822")
    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    @JsonProperty("observation_time_rfc822")
    public void setObservationTimeRfc822(String observationTimeRfc822) {
        this.observationTimeRfc822 = observationTimeRfc822;
    }

    @JsonProperty("observation_epoch")
    public String getObservationEpoch() {
        return observationEpoch;
    }

    @JsonProperty("observation_epoch")
    public void setObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
    }

    @JsonProperty("local_time_rfc822")
    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    @JsonProperty("local_time_rfc822")
    public void setLocalTimeRfc822(String localTimeRfc822) {
        this.localTimeRfc822 = localTimeRfc822;
    }

    @JsonProperty("local_epoch")
    public String getLocalEpoch() {
        return localEpoch;
    }

    @JsonProperty("local_epoch")
    public void setLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
    }

    @JsonProperty("local_tz_short")
    public String getLocalTzShort() {
        return localTzShort;
    }

    @JsonProperty("local_tz_short")
    public void setLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
    }

    @JsonProperty("local_tz_long")
    public String getLocalTzLong() {
        return localTzLong;
    }

    @JsonProperty("local_tz_long")
    public void setLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
    }

    @JsonProperty("local_tz_offset")
    public String getLocalTzOffset() {
        return localTzOffset;
    }

    @JsonProperty("local_tz_offset")
    public void setLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
    }

    @JsonProperty("weather")
    public String getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(String weather) {
        this.weather = weather;
    }

    @JsonProperty("temperature_string")
    public String getTemperatureString() {
        return temperatureString;
    }

    @JsonProperty("temperature_string")
    public void setTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
    }

    @JsonProperty("temp_f")
    public Integer getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(Integer tempF) {
        this.tempF = tempF;
    }

    @JsonProperty("temp_c")
    public Integer getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(Integer tempC) {
        this.tempC = tempC;
    }

    @JsonProperty("relative_humidity")
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    @JsonProperty("relative_humidity")
    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    @JsonProperty("wind_string")
    public String getWindString() {
        return windString;
    }

    @JsonProperty("wind_string")
    public void setWindString(String windString) {
        this.windString = windString;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("wind_degrees")
    public Integer getWindDegrees() {
        return windDegrees;
    }

    @JsonProperty("wind_degrees")
    public void setWindDegrees(Integer windDegrees) {
        this.windDegrees = windDegrees;
    }

    @JsonProperty("wind_mph")
    public Integer getWindMph() {
        return windMph;
    }

    @JsonProperty("wind_mph")
    public void setWindMph(Integer windMph) {
        this.windMph = windMph;
    }

    @JsonProperty("wind_gust_mph")
    public String getWindGustMph() {
        return windGustMph;
    }

    @JsonProperty("wind_gust_mph")
    public void setWindGustMph(String windGustMph) {
        this.windGustMph = windGustMph;
    }

    @JsonProperty("wind_kph")
    public Integer getWindKph() {
        return windKph;
    }

    @JsonProperty("wind_kph")
    public void setWindKph(Integer windKph) {
        this.windKph = windKph;
    }

    @JsonProperty("wind_gust_kph")
    public String getWindGustKph() {
        return windGustKph;
    }

    @JsonProperty("wind_gust_kph")
    public void setWindGustKph(String windGustKph) {
        this.windGustKph = windGustKph;
    }

    @JsonProperty("pressure_mb")
    public String getPressureMb() {
        return pressureMb;
    }

    @JsonProperty("pressure_mb")
    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    @JsonProperty("pressure_in")
    public String getPressureIn() {
        return pressureIn;
    }

    @JsonProperty("pressure_in")
    public void setPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
    }

    @JsonProperty("pressure_trend")
    public String getPressureTrend() {
        return pressureTrend;
    }

    @JsonProperty("pressure_trend")
    public void setPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
    }

    @JsonProperty("dewpoint_string")
    public String getDewpointString() {
        return dewpointString;
    }

    @JsonProperty("dewpoint_string")
    public void setDewpointString(String dewpointString) {
        this.dewpointString = dewpointString;
    }

    @JsonProperty("dewpoint_f")
    public Integer getDewpointF() {
        return dewpointF;
    }

    @JsonProperty("dewpoint_f")
    public void setDewpointF(Integer dewpointF) {
        this.dewpointF = dewpointF;
    }

    @JsonProperty("dewpoint_c")
    public Integer getDewpointC() {
        return dewpointC;
    }

    @JsonProperty("dewpoint_c")
    public void setDewpointC(Integer dewpointC) {
        this.dewpointC = dewpointC;
    }

    @JsonProperty("heat_index_string")
    public String getHeatIndexString() {
        return heatIndexString;
    }

    @JsonProperty("heat_index_string")
    public void setHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
    }

    @JsonProperty("heat_index_f")
    public Integer getHeatIndexF() {
        return heatIndexF;
    }

    @JsonProperty("heat_index_f")
    public void setHeatIndexF(Integer heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    @JsonProperty("heat_index_c")
    public Integer getHeatIndexC() {
        return heatIndexC;
    }

    @JsonProperty("heat_index_c")
    public void setHeatIndexC(Integer heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    @JsonProperty("windchill_string")
    public String getWindchillString() {
        return windchillString;
    }

    @JsonProperty("windchill_string")
    public void setWindchillString(String windchillString) {
        this.windchillString = windchillString;
    }

    @JsonProperty("windchill_f")
    public String getWindchillF() {
        return windchillF;
    }

    @JsonProperty("windchill_f")
    public void setWindchillF(String windchillF) {
        this.windchillF = windchillF;
    }

    @JsonProperty("windchill_c")
    public String getWindchillC() {
        return windchillC;
    }

    @JsonProperty("windchill_c")
    public void setWindchillC(String windchillC) {
        this.windchillC = windchillC;
    }

    @JsonProperty("feelslike_string")
    public String getFeelslikeString() {
        return feelslikeString;
    }

    @JsonProperty("feelslike_string")
    public void setFeelslikeString(String feelslikeString) {
        this.feelslikeString = feelslikeString;
    }

    @JsonProperty("feelslike_f")
    public String getFeelslikeF() {
        return feelslikeF;
    }

    @JsonProperty("feelslike_f")
    public void setFeelslikeF(String feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    @JsonProperty("feelslike_c")
    public String getFeelslikeC() {
        return feelslikeC;
    }

    @JsonProperty("feelslike_c")
    public void setFeelslikeC(String feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    @JsonProperty("visibility_mi")
    public String getVisibilityMi() {
        return visibilityMi;
    }

    @JsonProperty("visibility_mi")
    public void setVisibilityMi(String visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    @JsonProperty("visibility_km")
    public String getVisibilityKm() {
        return visibilityKm;
    }

    @JsonProperty("visibility_km")
    public void setVisibilityKm(String visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    @JsonProperty("solarradiation")
    public String getSolarradiation() {
        return solarradiation;
    }

    @JsonProperty("solarradiation")
    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    @JsonProperty("UV")
    public String getUV() {
        return uV;
    }

    @JsonProperty("UV")
    public void setUV(String uV) {
        this.uV = uV;
    }

    @JsonProperty("precip_1hr_string")
    public String getPrecip1hrString() {
        return precip1hrString;
    }

    @JsonProperty("precip_1hr_string")
    public void setPrecip1hrString(String precip1hrString) {
        this.precip1hrString = precip1hrString;
    }

    @JsonProperty("precip_1hr_in")
    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    @JsonProperty("precip_1hr_in")
    public void setPrecip1hrIn(String precip1hrIn) {
        this.precip1hrIn = precip1hrIn;
    }

    @JsonProperty("precip_1hr_metric")
    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    @JsonProperty("precip_1hr_metric")
    public void setPrecip1hrMetric(String precip1hrMetric) {
        this.precip1hrMetric = precip1hrMetric;
    }

    @JsonProperty("precip_today_string")
    public String getPrecipTodayString() {
        return precipTodayString;
    }

    @JsonProperty("precip_today_string")
    public void setPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
    }

    @JsonProperty("precip_today_in")
    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    @JsonProperty("precip_today_in")
    public void setPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
    }

    @JsonProperty("precip_today_metric")
    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    @JsonProperty("precip_today_metric")
    public void setPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
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

    @JsonProperty("forecast_url")
    public String getForecastUrl() {
        return forecastUrl;
    }

    @JsonProperty("forecast_url")
    public void setForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
    }

    @JsonProperty("history_url")
    public String getHistoryUrl() {
        return historyUrl;
    }

    @JsonProperty("history_url")
    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    @JsonProperty("ob_url")
    public String getObUrl() {
        return obUrl;
    }

    @JsonProperty("ob_url")
    public void setObUrl(String obUrl) {
        this.obUrl = obUrl;
    }

    @JsonProperty("nowcast")
    public String getNowcast() {
        return nowcast;
    }

    @JsonProperty("nowcast")
    public void setNowcast(String nowcast) {
        this.nowcast = nowcast;
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
