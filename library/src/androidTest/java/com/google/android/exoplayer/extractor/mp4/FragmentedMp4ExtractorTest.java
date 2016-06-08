/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.testutil.TestUtil;

import android.test.InstrumentationTestCase;

/**
 * Unit test for {@link FragmentedMp4Extractor}.
 */
public final class FragmentedMp4ExtractorTest extends InstrumentationTestCase {

  public void testSample() throws Exception {
    TestUtil.assertOutput(new TestUtil.ExtractorFactory() {
      @Override
      public Extractor create() {
        return new FragmentedMp4Extractor();
      }
    }, "mp4/sample_fragmented.mp4", getInstrumentation());
  }

}
