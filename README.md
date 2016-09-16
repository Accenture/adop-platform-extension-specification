# Platform Extension Specification
The purpose of this repository is to define the specification of different platform extensions.

## Stucture
A platform specification is broken down into the following sections:

 * service
  * This is to add more services to the platform.
 * service\_ext
  * This is to extend the existing services in the platform.

## Metadata
Each cartridge should contain a "extension.metadata" file that specifies the following metadata:

 * `PLATFORM_EXTENSION_SDK_VERSION`
  * This defines the version of the Cartridge SDK that the cartridge conforms to
 * `PLATFORM_EXTENSION_NAME`
  * This is the name of the platform extension which should reflect the purpose of the extension.
 * `PLATFORM_EXTENSION_TYPE`
  * This is the name of the platform extension type e.g. aws, docker.

## Using this Repository
When developing a platform extension it is advisable to refer this repository to base the initial structure on.
