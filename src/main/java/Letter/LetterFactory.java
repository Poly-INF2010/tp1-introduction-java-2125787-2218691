package Letter;

import Interface.Rotate;
import Interface.Translate;
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
        BaseShape shapeA = new BaseShape();
        Rectangle brancheDroite = new Rectangle(halfStripeThickness, Math.sqrt((maxHeight * maxHeight) + (halfMaxWidth * halfMaxWidth)));
        Rectangle brancheGauche = brancheDroite.clone();
        Rectangle brancheMilieu = new Rectangle(halfMaxWidth, halfStripeThickness);
        Rectangle brancheHaut = new Rectangle(halfMaxWidth/2, halfStripeThickness);

        brancheDroite.rotate(brancheDroite.getCoords(), Math.tan(halfMaxWidth/maxHeight));
        brancheGauche.rotate(brancheGauche.getCoords(), -(Math.tan(halfMaxWidth/maxHeight)));

        brancheGauche.translate(brancheGauche.getCoords(), new Point2d(halfMaxWidth-halfStripeThickness, 0.0));
        brancheDroite.translate(brancheDroite.getCoords(), new Point2d(-(halfMaxWidth-halfStripeThickness), 0.0));
        brancheHaut.translate(brancheHaut.getCoords(), new Point2d(0.0, -(halfMaxHeight - (halfStripeThickness/2))));

        //Formation de la lettre A
        shapeA.add(brancheDroite);
        shapeA.add(brancheGauche);
        shapeA.add(brancheMilieu);
        shapeA.add(brancheHaut);
        return shapeA;
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

        BaseShape shapeB = new BaseShape();
        shapeB.add(cercleHaut);
        shapeB.add(cercleBas);
        shapeB.add(brancheGauche);
        return shapeB;
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

        BaseShape shapeC = new BaseShape();
        shapeC.add(ellipseLarge);
        return shapeC;
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

        BaseShape shapeE = new BaseShape();
        shapeE.add(brancheHaut);
        shapeE.add(brancheMilieu);
        shapeE.add(brancheGauche);
        shapeE.add(brancheBas);
        return shapeE;
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

        BaseShape shapeH = new BaseShape();
        shapeH.add(brancheMilieu);
        shapeH.add(brancheDroite);
        shapeH.add(brancheGauche);
        return shapeH;
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

        BaseShape shapeN = new BaseShape();
        shapeN.add(brancheMilieu);
        shapeN.add(brancheDroite);
        shapeN.add(brancheGauche);
        return shapeN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse ellipseLarge = new Ellipse(maxWidth, maxHeight);
        Ellipse ellipseEface = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);

        ellipseLarge.remove(ellipseEface);

        BaseShape shapeO = new BaseShape();
        shapeO.add(ellipseLarge);
        return shapeO;
    }

}
