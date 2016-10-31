// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.framework;

public interface GraphOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, use control flow to schedule the activation of Recv nodes.
   * (Currently ignored.)
   * </pre>
   *
   * <code>optional bool enable_recv_scheduling = 2;</code>
   */
  boolean getEnableRecvScheduling();

  /**
   * <pre>
   * Options controlling how graph is optimized.
   * </pre>
   *
   * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
   */
  boolean hasOptimizerOptions();
  /**
   * <pre>
   * Options controlling how graph is optimized.
   * </pre>
   *
   * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
   */
  org.tensorflow.framework.OptimizerOptions getOptimizerOptions();
  /**
   * <pre>
   * Options controlling how graph is optimized.
   * </pre>
   *
   * <code>optional .tensorflow.OptimizerOptions optimizer_options = 3;</code>
   */
  org.tensorflow.framework.OptimizerOptionsOrBuilder getOptimizerOptionsOrBuilder();

  /**
   * <pre>
   * The number of steps to run before returning a cost model detailing
   * the memory usage and performance of each node of the graph. 0 means
   * no cost model.
   * </pre>
   *
   * <code>optional int64 build_cost_model = 4;</code>
   */
  long getBuildCostModel();

  /**
   * <pre>
   * Annotate each Node with Op output shape data, to the extent it can
   * be statically inferred.
   * </pre>
   *
   * <code>optional bool infer_shapes = 5;</code>
   */
  boolean getInferShapes();

  /**
   * <pre>
   * Only place the subgraphs that are run, rather than the entire graph.
   * This is useful for interactive graph building, where one might
   * produce graphs that cannot be placed during the debugging
   * process.  In particular, it allows the client to continue work in
   * a session after adding a node to a graph whose placement
   * constraints are unsatisfiable.
   * </pre>
   *
   * <code>optional bool place_pruned_graph = 6;</code>
   */
  boolean getPlacePrunedGraph();
}
