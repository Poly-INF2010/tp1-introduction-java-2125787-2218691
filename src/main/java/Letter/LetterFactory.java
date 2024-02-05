package Letter;


import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        Rectangle brancheDroite = new Rectangle(halfStripeThickness, Math.sqrt((maxHeight * maxHeight) + (halfMaxWidth * halfMaxWidth)));
        Rectangle brancheGauche = brancheDroite.clone();
        Rectangle brancheMilieu = new Rectangle(halfMaxWidth, halfStripeThickness);
        Rectangle brancheHaut = new Rectangle(halfMaxWidth/2, halfStripeThickness);

        brancheDroite.rotate(brancheDroite.getCoords(), Math.tan(halfMaxWidth/maxHeight));
        brancheGauche.rotate(brancheGauche.getCoords(), -(Math.tan(halfMaxWidth/maxHeight)));

        brancheGauche.translate(brancheGauche.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness, 0.0));
        brancheDroite.translate(brancheDroite.getCoords(), new Point2d(-(halfMaxWidth-halfStripeThickness), 0.0));
        brancheHaut.translate(brancheHaut.getCoords(), new Point2d(0.0, -(halfMaxHeight - (halfStripeThickness/2))));

        return new BaseShape()
                .add(brancheDroite)
                .add(brancheGauche)
                .add(brancheMilieu)
                .add(brancheHaut);
    }
    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle brancheGauche = new Rectangle(stripeThickness, maxHeight);
        Circle cercleHaut = new Circle(halfMaxHeight / 2);
        Circle cercleBas = new Circle(halfMaxHeight / 2);
        Circle cercleEfface = new Circle((halfMaxHeight - stripeThickness) / 2);

        cercleHaut.remove(cercleEfface);
        cercleBas.remove(cercleEfface);

        cercleHaut.translate(cercleHaut.getCoords(), new Point2d(0.0, -(halfMaxHeight / 2)));
        cercleBas.translate(cercleBas.getCoords(), new Point2d(0.0, halfMaxHeight / 2));
        brancheGauche.translate(brancheGauche.getCoords(), new Point2d(-(halfMaxWidth), 0.0));

        return new BaseShape()
                .add(cercleHaut)
                .add(cercleBas)
                .add(brancheGauche);
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipseLarge = new Ellipse(maxWidth, maxHeight);
        Ellipse ellipseEface = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);
        Rectangle rectangleEface = new Rectangle(halfMaxWidth, halfMaxHeight + stripeThickness);

        rectangleEface.translate(rectangleEface.getCoords(), new Point2d(halfMaxWidth, 0.0));

        ellipseLarge.remove(ellipseEface);
        ellipseLarge.remove(rectangleEface);

        return new BaseShape()
                .add(ellipseLarge);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle brancheGauche = new Rectangle(stripeThickness, maxHeight);
        Rectangle brancheMilieu = new Rectangle(maxWidth, stripeThickness);
        Rectangle brancheBas = new Rectangle(maxWidth, stripeThickness);
        Rectangle brancheHaut = new Rectangle(maxWidth, stripeThickness);

        brancheGauche.translate(brancheGauche.getCoords(), new Point2d(-(halfMaxWidth-halfStripeThickness), 0.0));
        brancheHaut.translate(brancheHaut.getCoords(), new Point2d(0.0, -(halfMaxHeight - halfStripeThickness)));
        brancheBas.translate(brancheBas.getCoords(), new Point2d(0.0, halfMaxHeight - halfStripeThickness));

        return new BaseShape()
                .add(brancheHaut)
                .add(brancheMilieu)
                .add(brancheGauche)
                .add(brancheBas);
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle brancheDroite = new Rectangle(stripeThickness, maxHeight);
        Rectangle brancheGauche = new Rectangle(stripeThickness, maxHeight);
        Rectangle brancheMilieu = new Rectangle(maxWidth, stripeThickness);

        brancheDroite.translate(brancheDroite.getCoords(), new Point2d(halfMaxWidth, 0.0));
        brancheGauche.translate(brancheGauche.getCoords(), new Point2d(-(halfMaxWidth), 0.0));

        return new BaseShape()
                .add(brancheMilieu)
                .add(brancheDroite)
                .add(brancheGauche);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle brancheDroite = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle brancheGauche = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle brancheMilieu = new Rectangle(halfStripeThickness, maxHeight);

        brancheDroite.translate(brancheDroite.getCoords(), new Point2d(halfMaxWidth, 0.0));
        brancheGauche.translate(brancheGauche.getCoords(), new Point2d(-(halfMaxWidth), 0.0));
        brancheMilieu.rotate(brancheMilieu.getCoords(), -(Math.PI/8));

        return new BaseShape()
                .add(brancheMilieu)
                .add(brancheDroite)
                .add(brancheGauche);
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse ellipseLarge = new Ellipse(maxWidth, maxHeight);
        Ellipse ellipseEface = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);

        ellipseLarge.remove(ellipseEface);

        return new BaseShape()
                .add(ellipseLarge);
    }

}
