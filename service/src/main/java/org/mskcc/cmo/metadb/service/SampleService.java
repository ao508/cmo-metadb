package org.mskcc.cmo.metadb.service;

import java.util.List;
import java.util.UUID;
import org.mskcc.cmo.metadb.model.MetaDbSample;
import org.mskcc.cmo.metadb.model.SampleMetadata;

public interface SampleService {

    MetaDbSample saveSampleMetadata(MetaDbSample metaDbSample) throws Exception;

    MetaDbSample setUpMetaDbSample(MetaDbSample metaDbSample) throws Exception;

    List<MetaDbSample> findMatchedNormalSample(MetaDbSample metaDbSample)
            throws Exception;

    List<String> findPooledNormalSample(MetaDbSample metaDbSample) throws Exception;

    MetaDbSample getMetaDbSample(UUID metaDbSampleId) throws Exception;

    List<SampleMetadata> getSampleMetadataListByCmoPatientId(String cmoPatientId) throws Exception;
}
