package pattern.decorator.old_v;

/**
 * 饮料类
 *
 * @author chengshaojin
 * @since 2017/9/26
 */
public class Beverage {

    protected String description = "Unknown beverage";

    private double milkCost = .1;

    private double soyCost = .15;

    private double mochaCost = .2;

    private double whipCost = .1;

    private boolean milk;

    private boolean soy;

    private boolean mocha;

    private boolean whip;

    public double cost() {
        double totalCost = 0;
        if (isMilk()) {
            totalCost += milkCost;
        }
        if (isSoy()) {
            totalCost += soyCost;
        }
        if (isMocha()) {
            totalCost += mochaCost;
        }
        if (isWhip()) {
            totalCost += whipCost;
        }
        return totalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMilkCost() {
        return milkCost;
    }

    public void setMilkCost(double milkCost) {
        this.milkCost = milkCost;
    }

    public double getSoyCost() {
        return soyCost;
    }

    public void setSoyCost(double soyCost) {
        this.soyCost = soyCost;
    }

    public double getMochaCost() {
        return mochaCost;
    }

    public void setMochaCost(double mochaCost) {
        this.mochaCost = mochaCost;
    }

    public double getWhipCost() {
        return whipCost;
    }

    public void setWhipCost(double whipCost) {
        this.whipCost = whipCost;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Beverage{");
        sb.append("description='").append(description).append('\'');
        sb.append(", milkCost=").append(milkCost);
        sb.append(", soyCost=").append(soyCost);
        sb.append(", mochaCost=").append(mochaCost);
        sb.append(", whipCost=").append(whipCost);
        sb.append(", milk=").append(milk);
        sb.append(", soy=").append(soy);
        sb.append(", mocha=").append(mocha);
        sb.append(", whip=").append(whip);
        sb.append('}');
        return sb.toString();
    }
}
