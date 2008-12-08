/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hdr_plugin.response;

/**
 *
 * @author Alex
 */
public interface ResponseFunctionCalculator {

    public double[] calcResponse(int channel, int lambda);

    public ResponseFunctionCalculatorSettings getResponseFunctionCalculatorSettings();

    public String getAlgorithm();

    public String getAlgorithmReference();
}