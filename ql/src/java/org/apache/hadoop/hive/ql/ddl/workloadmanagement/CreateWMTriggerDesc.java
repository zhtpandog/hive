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

package org.apache.hadoop.hive.ql.ddl.workloadmanagement;

import java.io.Serializable;

import org.apache.hadoop.hive.metastore.api.WMTrigger;
import org.apache.hadoop.hive.ql.ddl.DDLDesc;
import org.apache.hadoop.hive.ql.plan.Explain;
import org.apache.hadoop.hive.ql.plan.Explain.Level;

/**
 * DDL task description for CREATE TRIGGER commands.
 */
@Explain(displayName="Create WM Trigger", explainLevels={ Level.USER, Level.DEFAULT, Level.EXTENDED })
public class CreateWMTriggerDesc implements DDLDesc, Serializable {
  private static final long serialVersionUID = 1705317739121300923L;

  private final WMTrigger trigger;

  public CreateWMTriggerDesc(WMTrigger trigger) {
    this.trigger = trigger;
  }

  @Explain(displayName="trigger", explainLevels={ Level.USER, Level.DEFAULT, Level.EXTENDED })
  public WMTrigger getTrigger() {
    return trigger;
  }
}
