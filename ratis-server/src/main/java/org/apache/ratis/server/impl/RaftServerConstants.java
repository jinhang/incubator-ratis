/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ratis.server.impl;

import org.apache.ratis.server.raftlog.RaftLog;

public final class RaftServerConstants {
  /** @deprecated use {@link RaftLog#INVALID_LOG_INDEX}. */
  @Deprecated
  public static final long INVALID_LOG_INDEX = RaftLog.INVALID_LOG_INDEX;
  public static final long DEFAULT_CALLID = 0;

  private RaftServerConstants() {
    //Never constructed
  }

  public enum StartupOption {
    FORMAT("format"),
    REGULAR("regular");

    private final String option;

    StartupOption(String arg) {
      this.option = arg;
    }

    public static StartupOption getOption(String arg) {
      for (StartupOption s : StartupOption.values()) {
        if (s.option.equals(arg)) {
          return s;
        }
      }
      return REGULAR;
    }
  }
}
