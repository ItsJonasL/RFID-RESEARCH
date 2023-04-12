# Change Log
These are development libraries for Impinj RAIN RFID Readers (Speedway® R120, R220 and
R420, and Impinj R510, R515 and R700) and Gateways (xPortal R640, xSpan R660 and xArray R680).

## [4.0.0]
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 4.0.0  |
|Octane Java SDK    | 4.0.0  |
|.NET LTK           | 11.0.0 |
|Java LTK           | 11.0.0 |
|C++ LTK for Win32  | 11.0.0 |
|C++ LTK for Linux  | 11.0.0 |
|C LTK for Linux    | 11.0.0 |
|LLRP Definitions   | 1.48.0 |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware |  8.0.0  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     |  8.0.0  |
|Impinj xSpan/xArray Installation and Operations Manual |  8.0.0  |
|Impinj Firmware Upgrade Reference Manual               |  8.0.0  |
|Impinj RShell Reference Manual                         |  8.0.0  |
|Impinj Octane SNMP                                     |  8.0.0  |
|Impinj Octane LLRP                                     |  8.0.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           |  8.0.0  |
|Impinj Embedded Developers Guide                       |  8.0.0  |
### New Features
- Added R510 and R515 in the reader models enum.
- Added TagModelName enum values and TagModelDetails for Monza M730 and M750 tags. [PI-26202]

### Changes
- Fixed issue with R700 reader settings (GPOs) [PI-25215]
- Fixed issue with handling report settings values [PI-25215]
- Fixed issues with Max Tx Power and Max Rx Sensitivity [PI-24071, PI-9381, PI-19870]
- Updated various examples found in the tar file in samples\com\example\sdksamples [PI-24925]
- Address log4j vulnerability by updating to LTK Java version 11.0.0, which uses log4j 2.17.1 [PI-27184]
- Update Apache Mina dependency from 2.0.17 to 2.1.5 [PI-27233]

## [3.7.0]
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 3.7.0   |
|Octane Java SDK    | 3.7.0   |
|.NET LTK           | 10.46.0 |
|Java LTK           | 10.46.0 |
|C++ LTK for Win32  | 10.46.0 |
|C++ LTK for Linux  | 10.46.0 |
|C LTK for Linux    | 10.46.0 |
|LLRP Definitions   | 1.46.0  |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware |  7.6.0  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     |  7.6.0  |
|Impinj xSpan/xArray Installation and Operations Manual |  7.6.0  |
|Impinj Firmware Upgrade Reference Manual               |  7.6.0  |
|Impinj RShell Reference Manual                         |  7.6.0  |
|Impinj Octane SNMP                                     |  7.6.0  |
|Impinj Octane LLRP                                     |  7.6.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           |  7.6.0  |
|Impinj Embedded Developers Guide                       |  7.6.0  |
### New Features
- Added support for Tag Filter Verification, PI-24051.

## [3.6.0]
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 3.6.0   |
|Octane Java SDK    | 3.6.0   |
|.NET LTK           | 10.44.0 |
|Java LTK           | 10.44.0 |
|C++ LTK for Win32  | 10.44.0 |
|C++ LTK for Linux  | 10.44.0 |
|C LTK for Linux    | 10.44.0 |
|LLRP Definitions   | 1.44.0  |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware |  7.5.0  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     |  7.5.0  |
|Impinj xSpan/xArray Installation and Operations Manual |  7.5.0  |
|Impinj Firmware Upgrade Reference Manual               |  7.5.0  |
|Impinj RShell Reference Manual                         |  7.5.0  |
|Impinj Octane SNMP                                     |  7.5.0  |
|Impinj Octane LLRP                                     |  7.5.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           |  7.5.0  |
|Impinj Embedded Developers Guide                       |  7.5.0  |
### New Features
- Added new Morocco region
- Allow for debounce value of zero

## [3.5.0]
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 3.5.0   |
|Octane Java SDK    | 3.5.0   |
|.NET LTK           | 10.42.0 |
|Java LTK           | 10.42.0 |
|C++ LTK for Win32  | 10.42.0 |
|C++ LTK for Linux  | 10.42.0 |
|C LTK for Linux    | 10.42.0 |
|LLRP Definitions   | 1.42.0  |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware |  7.4.0  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     |  7.4.0  |
|Impinj xSpan/xArray Installation and Operations Manual |  7.4.0  |
|Impinj Firmware Upgrade Reference Manual               |  7.4.0  |
|Impinj RShell Reference Manual                         |  7.4.0  |
|Impinj Octane SNMP                                     |  7.4.0  |
|Impinj Octane LLRP                                     |  7.4.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           |  7.4.0  |
|Impinj Embedded Developers Guide                       |  7.4.0  |
### New Features
- Add support for TagImpinjAuthenticateOp for M77x Impinj tag ICs 

## [3.4.0]
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 3.4.0   |
|Octane Java SDK    | 3.4.0   |
|.NET LTK           | 10.40.0 |
|Java LTK           | 10.40.0 |
|C++ LTK for Win32  | 10.40.0 |
|C++ LTK for Linux  | 10.40.0 |
|C LTK for Linux    | 10.40.0 |
|LLRP Definitions   | 1.38.0  |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware |  7.3.0  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     |  7.3.0  |
|Impinj xSpan/xArray Installation and Operations Manual |  7.3.0  |
|Impinj Firmware Upgrade Reference Manual               |  7.3.0  |
|Impinj RShell Reference Manual                         |  7.3.0  |
|Impinj Octane SNMP                                     |  7.3.0  |
|Impinj Octane LLRP                                     |  7.3.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           |  7.3.0  |
|Impinj Embedded Developers Guide                       |  7.3.0  |
### New Features
- Changed LocationConfidenceFactor's read count property to an int (breaking change)

## [3.3.0]
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 3.3.0   |
|Octane Java SDK    | 3.3.0   |
|.NET LTK           | 10.38.0 |
|Java LTK           | 10.38.0 |
|C++ LTK for Win32  | 10.38.0 |
|C++ LTK for Linux  | 10.38.0 |
|C LTK for Linux    | 10.38.0 |
|LLRP Definitions   | 1.38.0  |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware |  7.1.0  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     |  7.1.0  |
|Impinj xSpan/xArray Installation and Operations Manual |  7.1.0  |
|Impinj Firmware Upgrade Reference Manual               |  7.1.0  |
|Impinj RShell Reference Manual                         |  7.1.0  |
|Impinj Octane SNMP                                     |  7.1.0  |
|Impinj Octane LLRP                                     |  7.1.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           |  7.1.0  |
|Impinj Embedded Developers Guide                       |  7.1.0  |
### New Features
- Added support for truncated reply

## [3.2.0.0]
#### Application Compatibility 2020-2-4
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 3.2.0   |
|Octane Java SDK    | 3.2.0   |
|.NET LTK           | 10.36.0 |
|Java LTK           | 10.36.0 |
|C++ LTK for Win32  | 10.36.0 |
|C++ LTK for Linux  | 10.36.0 |
|C LTK for Linux    | 10.36.0 |
|LLRP Definitions   | 1.30    |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware | 7.0.0   |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     | 7.0.0   |
|Impinj xSpan/xArray Installation and Operations Manual | 7.0.0   |
|Impinj Firmware Upgrade Reference Manual               | 7.0.0   |
|Impinj RShell Reference Manual                         | 7.0.0   |
|Impinj Octane SNMP                                     | 7.0.0   |
|Impinj Octane LLRP                                     | 7.0.0   |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           | 7.0.0   |
|Impinj Embedded Developers Guide                       | 7.0.0   |
### New Features
- Added support for Impinj R700 Fixed Reader

## [1.30.0.0]
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 2.30.0  |
|Octane Java SDK    | 1.30.0  |
|.NET LTK           | 10.30.0 |
|Java LTK           | 10.30.0 |
|C++ LTK for Win32  | 10.30.0 |
|C++ LTK for Linux  | 10.30.0 |
|C LTK for Linux    | 10.30.0 |
|LLRP Definitions   | 1.28    |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware | 5.12.0  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     | 5.12.0  |
|Impinj xSpan/xArray Installation and Operations Manual | 5.12.0  |
|Impinj Firmware Upgrade Reference Manual               | 5.12.0  |
|Impinj RShell Reference Manual                         | 5.12.0  |
|Impinj Octane SNMP                                     | 5.12.0  |
|Impinj Octane LLRP                                     | 5.12.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           | 5.12.0  |
|Impinj Embedded Developers Guide                       | 5.12.0  |
### New Features
- The reader's feature set now includes a list of supported reader modes.
- Reduced power frequency list is now available.
- Added support for Monza R6-A tags.

## [1.26.0] - 2016-12-19
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 2.26.0  |
|Octane Java SDK    | 1.26.0  |
|.NET LTK           | 10.26.0 |
|Java LTK           | 10.26.0 |
|C++ LTK for Win32  | 10.26.0 |
|C++ LTK for Linux  | 10.26.0 |
|C LTK for Linux    | 10.26.0 |
|LLRP Definitions   | 1.26.0  |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware | 5.10.0  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     | 5.10.0  |
|Impinj xSpan/xArray Installation and Operations Manual | 5.10.0  |
|Impinj Firmware Upgrade Reference Manual               | 5.10.0  |
|Impinj RShell Reference Manual                         | 5.10.0  |
|Impinj Octane SNMP                                     | 5.10.0  |
|Impinj Octane LLRP                                     | 5.10.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           | 5.10.0  |
|Impinj Embedded Developers Guide                       | 5.10.0  |
### New Features
- Added IPv6 support to all libarries 
  - Octane .NET SDK 
  - Octane Java SDK 
  - .NET LTK 
  - Java LTK 
  - C++ LTK for Win32 
  - C++ LTK for Linux 
  - C LTK for Linux 
- Moved .NET LTK and .NET SDK to .NET Framework version 4.6.1 
- Removed xArrayLocationWam SDK example 

## [1.24.1] - 2016-10-26
#### Application Compatibility
| Library           | Version |
|-------------------|---------|
|Octane .NET SDK    | 2.24.1  |
|Octane Java SDK    | 1.24.1  |
|.NET LTK           | 10.24.1 |
|Java LTK           | 10.24.1 |
|C++ LTK for Win32  | 10.24.1 |
|C++ LTK for Linux  | 10.24.1 |
|C LTK for Linux    | 10.24.1 |
|LLRP Definitions   | 1.24.1  |
#### Firmware Compatibility
| Firmware        | Version |
|-----------------|---------|
| Octane Firmware |  2.8.1  |
#### Document Compatibility
| Document                                              | Version |
|-------------------------------------------------------|---------|
|Impinj Speedway Installation and Operations Manual     |  5.8.0  |
|Impinj xSpan/xArray Installation and Operations Manual |  5.8.0  |
|Impinj Firmware Upgrade Reference Manual               |  5.8.0  |
|Impinj RShell Reference Manual                         |  5.8.0  |
|Impinj Octane SNMP                                     |  5.8.0  |
|Impinj Octane LLRP                                     |  5.8.0  |
|Impinj LLRP Tool Kit (LTK) Programmers Guide           |  5.8.0  |
|Impinj Embedded Developers Guide                       |  5.8.0  |
### New Features
- New *SingleTargetReset* search mode.  Used in combination with *SingleTarget* 
  inventory to speed the completion of an inventory round by setting tags in B 
  state back to A state.
- New *SpatialConfig* class.  Used with xSpan and xArray gateways to configure 
  Direction Mode.  Used with the xArray gateway to configure Location Mode. 
- New *AntennaUtilities* class.  Used to provide an easier method of selecting 
  xSpan and xArray antenna beams by rings and sectors. 
- New *ImpinjMarginRead* class.  Used to check if Monza 6 tag IC memory cells 
  are fully charged, providing an additional measure of confidence in how well 
  the tag has been encoded.
### Changes
- All LTKs and SDKs now support connecting to readers over a secured connection. 
  Please see the library-specific documentation for more information on how to 
  make your application take advantage of this new feature. 
- All LTKs and SDKs now support Octane's new "Direction" feature for xArray.  
  Please see the library-specific documentation for more information on how to 
  use this new functionality. 
- The Java LTK has upgraded the version of Mina it uses to 2.0.9 (up from 1.1.7)
- For xArray-based applications using the SDK, transmit power can now be set 
  inside of the LocationConfig object. 
- All C and C++ LTKs now rely on the OpenSSL Libraries for network communication. 
  For the Win32 LTK, a copy of libeay32.dll and ssleay32.dll are provided.  For 
  the Linux C/C++ LTKs, libraries are only provided for the Atmel architecture 
  to enable linking for onreader apps.  Libraries for other architectures 
  running Linux are not provided as they should already be available from 
  your Linux distribution. 
- For the C, C++ for Linux, and C++ for Windows libraries, we implemented a fix 
  for non-blocking network communication for unencrypted (traditional) 
  connections to the reader.  However, if a user is attempting to connect over 
  a TLS-encrypted connection, non-blocking calls to recvMessage are still not 
  supported 
