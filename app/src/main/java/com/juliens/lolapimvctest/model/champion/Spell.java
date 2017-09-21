
package com.juliens.lolapimvctest.model.champion;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Spell implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("tooltip")
    @Expose
    private String tooltip;
    @SerializedName("leveltip")
    @Expose
    private Leveltip leveltip;
    @SerializedName("maxrank")
    @Expose
    private Integer maxrank;
    @SerializedName("cooldown")
    @Expose
    private List<Double> cooldown = null;
    @SerializedName("cooldownBurn")
    @Expose
    private String cooldownBurn;
    @SerializedName("cost")
    @Expose
    private List<Integer> cost = null;
    @SerializedName("costBurn")
    @Expose
    private String costBurn;
    @SerializedName("effect")
    @Expose
    private List<Object> effect = null;
    @SerializedName("effectBurn")
    @Expose
    private List<Object> effectBurn = null;
    @SerializedName("vars")
    @Expose
    private List<Var> vars = null;
    @SerializedName("costType")
    @Expose
    private String costType;
    @SerializedName("maxammo")
    @Expose
    private String maxammo;
    @SerializedName("range")
    @Expose
    private List<Integer> range = null;
    @SerializedName("rangeBurn")
    @Expose
    private String rangeBurn;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("resource")
    @Expose
    private String resource;
    public final static Parcelable.Creator<Spell> CREATOR = new Creator<Spell>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Spell createFromParcel(Parcel in) {
            Spell instance = new Spell();
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.description = ((String) in.readValue((String.class.getClassLoader())));
            instance.tooltip = ((String) in.readValue((String.class.getClassLoader())));
            instance.leveltip = ((Leveltip) in.readValue((Leveltip.class.getClassLoader())));
            instance.maxrank = ((Integer) in.readValue((Integer.class.getClassLoader())));
            in.readList(instance.cooldown, (java.lang.Double.class.getClassLoader()));
            instance.cooldownBurn = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.cost, (java.lang.Integer.class.getClassLoader()));
            instance.costBurn = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.effect, (java.lang.Object.class.getClassLoader()));
            in.readList(instance.effectBurn, (java.lang.Object.class.getClassLoader()));
            in.readList(instance.vars, (com.juliens.lolapimvctest.model.champion.Var.class.getClassLoader()));
            instance.costType = ((String) in.readValue((String.class.getClassLoader())));
            instance.maxammo = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.range, (java.lang.Integer.class.getClassLoader()));
            instance.rangeBurn = ((String) in.readValue((String.class.getClassLoader())));
            instance.image = ((Image) in.readValue((Image.class.getClassLoader())));
            instance.resource = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Spell[] newArray(int size) {
            return (new Spell[size]);
        }

    }
            ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public Leveltip getLeveltip() {
        return leveltip;
    }

    public void setLeveltip(Leveltip leveltip) {
        this.leveltip = leveltip;
    }

    public Integer getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(Integer maxrank) {
        this.maxrank = maxrank;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Double> cooldown) {
        this.cooldown = cooldown;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public void setEffect(List<Object> effect) {
        this.effect = effect;
    }

    public List<Object> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<Object> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public List<Var> getVars() {
        return vars;
    }

    public void setVars(List<Var> vars) {
        this.vars = vars;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getMaxammo() {
        return maxammo;
    }

    public void setMaxammo(String maxammo) {
        this.maxammo = maxammo;
    }

    public List<Integer> getRange() {
        return range;
    }

    public void setRange(List<Integer> range) {
        this.range = range;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(tooltip);
        dest.writeValue(leveltip);
        dest.writeValue(maxrank);
        dest.writeList(cooldown);
        dest.writeValue(cooldownBurn);
        dest.writeList(cost);
        dest.writeValue(costBurn);
        dest.writeList(effect);
        dest.writeList(effectBurn);
        dest.writeList(vars);
        dest.writeValue(costType);
        dest.writeValue(maxammo);
        dest.writeList(range);
        dest.writeValue(rangeBurn);
        dest.writeValue(image);
        dest.writeValue(resource);
    }

    public int describeContents() {
        return 0;
    }

}